class Solution {
    public int rob(int[] nums) {
        
        int n = nums.length;
        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);
        return Math.max(helper(Arrays.copyOfRange(nums,0,n-1)),
                        helper(Arrays.copyOfRange(nums,1,n)));
    }

    public static int helper(int[] nums) {
        int[] arr = new int[nums.length];
        arr[0]=nums[0];
        arr[1]=Math.max(nums[0],nums[1]);
        for(int i=2; i<nums.length; i++) {
            arr[i]=Math.max(arr[i-1],(nums[i]+arr[i-2]));
        }
          
        return arr[nums.length-1];
    }
}