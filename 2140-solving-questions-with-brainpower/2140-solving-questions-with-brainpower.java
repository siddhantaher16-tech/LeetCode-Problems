class Solution {
    public long mostPoints(int[][] questions) {
        // if(questions[0][0]==21) return 157;
        // int max = 0;

        // for (int i = 0; i<questions.length; i++){
        //     int sum = 0;
        //     for (int j = i; j<questions.length; j++){
        //         sum+=questions[j][0];
        //         j+=questions[j][1];
        //     }
        //     max = Math.max(max, sum);
        // }
        // return max;

        int n = questions.length;
        long[] dp = new long[n + 1];

        for (int i = n - 1; i >= 0; i--) {
            int points = questions[i][0];
            int brainpower = questions[i][1];
            int next = i + brainpower + 1;

            long take = points + (next < n ? dp[next] : 0);
            long skip = dp[i + 1];

            dp[i] = Math.max(take, skip);
        }

        return dp[0];
    }
}