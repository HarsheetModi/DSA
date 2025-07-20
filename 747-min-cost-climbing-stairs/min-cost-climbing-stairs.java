class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
    int[] dp = new int[n + 1];
    // dp[0] = 0;
    // dp[1] = 0;

    for (int i = 2; i <= n; i++) {
        dp[i] = Math.min(dp[i - 1] + cost[i - 1], 
                         dp[i - 2] + cost[i - 2]);
    }

    return dp[n];
        
        
        // int tcost = 0;
        // if(cost.length<2){
        //     if(cost[0]<cost[1]){
        //         return cost[0];
        //     }
        //     else return cost[1];
        // }
        // int i =-1;
        // while(i<cost.length-2){
        //     if(cost[i+1]<cost[i+2]){
        //         tcost = tcost + cost[i+1];
        //     }
        //     else{
        //         tcost = tcost + cost[i+2];
        //         i= i+2;
        //     }
        // }
        // return tcost;
    }
}