package Week1.IsPrime;

public class Solution {
    public boolean isPrime(int n) {
        if( n < 2) return false ;
        for( int i = 2 ; i <= Math.sqrt(n) ; i++ ) {
            if ( n % i == 0 ) return false ;
        }
        return true ;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPrime(13));
    }
}
