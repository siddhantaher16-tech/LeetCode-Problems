class Solution {
    public int maximumDifference(int[] nums) {
        int op = -1;
        int min = Integer.MAX_VALUE;

        for(int ele : nums){
            if(ele<min) min=ele;
            op = Math.max(op,ele-min);
        }

        return op==0?-1:op;
    }
}