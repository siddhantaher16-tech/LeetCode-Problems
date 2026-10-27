class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int pro = 0;

        for(int ele : prices){
            buy = Math.min(buy, ele);
            pro = Math.max(pro,ele-buy);
        }

        return pro;
    }
}