class Solution {
    public int majorityElement(int[] nums) {
        int max=0, ele=0, cnt=0, a=0 ;
        boolean [] arr = new boolean[nums.length];
        for(int i=0; i<nums.length; i++){
            a=nums[i];
            if(arr[i]) continue;
            for(int j=0; j<nums.length; j++ ){
                if(nums[j]==a){
                    cnt++;
                    arr[j]=true;
                }
            }
            if(cnt>max){
                max=cnt;
                ele=a;
            }
            cnt=0;
        }
        return ele;
        
    }
}