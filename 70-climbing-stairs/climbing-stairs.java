import java.util.Arrays;
class Solution {
    int[] dp = new int[46];
     
    public int climbStairs(int n) {
        // if(n<=1) return 1;
        // if(dp[n]!=0) return dp[n];
        // return dp[n] = climbStairs(n-1) + climbStairs(n-2);


        int prev1 = 1;
        int prev2 = 1;
        int curr =1;
        for(int i=0; i<n-1; i++){
            curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        return curr;
    }
}