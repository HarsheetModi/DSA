class Solution {
    
    public int missingNumber(int[] nums) {
        int sum = 0;
        int i=0;
        int osum = 0;
        for(; i<nums.length; i++){
            osum = osum+nums[i];
            sum = sum+i;
        }
        sum= sum+i;
        return sum-osum;
        
    }
}