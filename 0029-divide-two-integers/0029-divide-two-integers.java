class Solution {
    public int divide(int dividend, int divisor) {
         if(dividend == divisor) return 1;
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        if(divisor == 1) return dividend;
        if(dividend == -1) return -dividend;
        return dividend/divisor;
    }
}