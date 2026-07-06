class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        // int cnt = intervals.length;
        // int[] max = new int[2];
        // int diff = 0;
        
        // for(int[] ele : intervals){
        //     int diffA = ele[1]-ele[0]; 
        //     if(diffA>diff) {
        //         diff=diffA;
        //         max = ele;
        //     }
        // }

        int cnt = intervals.length;
        boolean[] arr = new boolean[intervals.length];
        for(int[] max : intervals){
            for(int i=0; i<intervals.length; i++){
                if(max[0]<=intervals[i][0] && max[1]>=intervals[i][1] && !arr[i]){
                    if(!max.equals(intervals[i])){
                        arr[i] = true;
                        cnt--;
                    }
                }
            }
        }

        return cnt;
    }
}