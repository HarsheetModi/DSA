class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0, max = nums[0];
        for(int i =0; i<nums.length; i++){
            sum = sum + nums[i];
            if(sum > max){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return max;


    //     int max_so_far = nums[0];
    //     int max_ending_here = nums[0];

    //     for(int i=1; i<nums.length; i++){
    //         max_ending_here = Math.max(nums[i], nums[i]+ max_ending_here);
    //         max_so_far = Math.max(max_so_far, max_ending_here);
    //     }

    // return max_so_far;



















        // int res =nums[0];
        // int maxending = nums[0];
        // for(int i =1;i<nums.length;i++){
        //     maxending = Math.max(maxending+nums[i], nums[i]);
        //     res = Math.max(maxending, res);
        // }
        // return res;










        // int res=Integer.MIN_VALUE;
        // for(int i =0;i<nums.length;i++){
        //     int cur =0;
        //     for(int j=i;j<nums.length;j++){
        //         cur= cur+nums[j];
        //         if(cur>res){
        //         res =cur;
        //     }
        //     }
            
        // }
        // return res;
    }
}