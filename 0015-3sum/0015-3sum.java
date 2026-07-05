class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        int i,j,k;
        Arrays.sort(nums);

        for(i=0; i<nums.length-2; i++){
            j=i+1;
            k=nums.length-1;
            if(i>0 && nums[i]==nums[i-1]) continue;
            
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum<0) j++;
                else if(sum>0) k--;
                else{
                    list.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]) j++;
                    while(j<k && nums[k]==nums[k+1]) k--;
                }
            }
        }
        return list;















        // HashSet<List<Integer>> list = new HashSet<List<Integer>>();
        // int i,j,k;
        // Arrays.sort(nums);
        // for(i=0; i<nums.length-2; i++){
        //     List<Integer> set = new ArrayList<Integer>();
        //     set.add(nums[i]);
        //     for(j=i+1; j<nums.length-1; j++){
        //         set.add(nums[j]);
        //         outerLoop:
        //         for(k=j+1; k<nums.length; k++){
        //             set.add(nums[k]);
        //             int sum = 0;
        //             for(int ele : set) sum+=ele;
        //             if(sum==0){
        //                 list.add(new ArrayList<Integer>(set));
        //             }
        //             set.remove(2);
        //         }
        //         set.remove(1);
        //     }
        //     set.remove(0);
        // }
        // return new ArrayList<List<Integer>>(list);
    }
}