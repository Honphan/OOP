package Week1.Fibonacci;

public class Solution {
    /**
     * fibo.
     */
    public static long fibonacci(long n) {
        if (n < 0) {
            return -1;
        }
        long[] fibo = new long[100];
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i <= n; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
            if (fibo[i] < 0) {
                return Long.MAX_VALUE;
            }
        }
        return fibo[(int) n];

    }

    public static void main(String[] args) {
        System.out.println(Solution.fibonacci(96));
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
    }
}
