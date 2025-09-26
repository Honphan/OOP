package Week2.fraction;

public class Solution {
    private int numerator;
    private int denominator;

    /**
     * method solution.
     */
    public Solution(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator != 0) {
            this.denominator = denominator;
        } else {
            this.denominator = 1;
        }

    }

    /**
     * method gcd.
     */
    public int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    /**
     * method reduce.
     */
    public Solution reduce() {
        int g = gcd(numerator, denominator);
        this.numerator /= g;
        this.denominator /= g;
        return this;
    }

    /**
     * method add.
     */
    public Solution add(Solution s) {
        this.numerator = this.numerator * s.denominator + s.numerator * this.denominator;
        this.denominator = this.denominator * s.denominator;
        return this.reduce();
    }

    /**
     * method subtract.
     */
    public Solution subtract(Solution s) {
        this.numerator = this.numerator * s.denominator - s.numerator * this.denominator;
        this.denominator = this.denominator * s.denominator;
        return this.reduce();
    }

    /**
     * method multiply.
     */
    public Solution multiply(Solution s) {
        this.numerator = this.numerator * s.numerator;
        this.denominator = this.denominator * s.denominator;
        return this.reduce();
    }

    /**
     * method divide.
     */
    public Solution divide(Solution s) {
        this.numerator = this.numerator * s.denominator;
        this.denominator = this.denominator * s.numerator;
        return this.reduce();
    }

    /**
     * method equals.
     */
    public boolean equals(Object o) {
        if (o instanceof Solution) {
            Solution s = (Solution) o;
            s.reduce();
            return this.numerator == s.numerator && this.denominator == s.denominator;
        }
        return false;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    /**
     * method.
     */
    public void setDenominator(int denominator) {
        if (denominator == 0) {
            this.denominator = 1;
        }
        this.denominator = denominator;
    }

}
