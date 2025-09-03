import java.util.*;
class Solution {
    
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> pairs = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            int val = target - nums[i];
            if(pairs.containsKey(val)){
                return new int[]{i, pairs.get(val) };
            }
            pairs.put(nums[i], i);
        }
        return new int[]{};
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // int[] res = new int[2];
        // for(int i =0;i<nums.length-1;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]+nums[j]==target && i!=j){
        //             res[0]=i;
        //             res[1]=j;
        //         }
        //     }
        // }
        // return res;


















    //     int[] ans = new int[2];
    //     for(int i =0;i<nums.length;i++){
    //         for(int j=0;j<nums.length;j++){
    //             if(i==j){
    //                 continue;
    //             }
    //             else{
    //                 if(nums[i]+nums[j]==target){
    //                     ans[0] = i;
    //                     ans[1] = j;
    //                     return ans;
    //                 }
    //             }
    //         }
    //     }
    //     return ans;
    //
     }
}