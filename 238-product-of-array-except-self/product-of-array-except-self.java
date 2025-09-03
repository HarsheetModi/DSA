class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pref = new int[nums.length];
        int[] suff = new int[nums.length];
        int[] ans = new int[nums.length];

        pref[0] = suff[nums.length-1] = 1;

        int pre = 1;
        int suf = 1;

        for(int i=1;i<nums.length;i++){
            pre = pre * nums[i-1];
            suf = suf * nums[nums.length-i];
            pref[i] = pre;
            suff[nums.length-i-1] = suf;
        }

        for(int i =0;i<nums.length;i++){
            ans[i] = pref[i] * suff[i];
        }
        return ans;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // int[] res = new int[nums.length];
        // for(int i =0;i<nums.length;i++){
        //     res[i] =1;
        // }
        // int left =1;
        // for(int i=0;i<nums.length;i++){
        //     res[i] = res[i]*left;
        //     left = left*nums[i];
        // }
        // int right=1;
        // for(int i=nums.length-1;i>=0;i--){
        //     res[i] = res[i]*right;
        //     right = right * nums[i];
        // }
        // return res;













        // for(int i =0;i<nums.length;i++){
        //     int left = 1;
        //     int right = 1;
        //     for(int j=0;j<i;j++){
        //         left = left * nums[j];
        //     }
        //     for(int j=i+1;j<nums.length;j++){
        //         right = right * nums[j];
        //     }
        //     int pro = left*right;
        //     res[i] = pro;
            
        // }
        // return res;
    }
}