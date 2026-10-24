class Solution {
    public int fib(int n) {
        if(n==1) return 1;
        int num1=0, num2=1, num3;
        for(int i=1; i<n; i++) {
            num3 = num2 + num1;
            if(i==n-1) return num2+num1;
            num1=num2;
            num2=num3;
        }
        return 0;
    }
}