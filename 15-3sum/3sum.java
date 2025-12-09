class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum>0){
                    right--;
                }
                else if(sum<0){
                    left++;
                }
                else{
                    List<Integer> addval = new ArrayList<>();
                    addval.add(nums[i]);
                    addval.add(nums[left]);
                    addval.add(nums[right]);
                    res.add(addval);
                    left++;
                    while(nums[left]==nums[left-1]&&left<right){
                        left++;
                    }
                    
                }
            }
        }
        return res;























        // for(int i=0;i<nums.length-2;i++){
        //     for(int first= i+1;first<nums.length-1;first++){
        //     int second =first+1;
        //     while(second<nums.length){
        //         if(nums[i]+nums[first]+nums[second]==0){
        //             List<Integer> addval = new ArrayList<>();
        //             addval.add(nums[i]);
        //             addval.add(nums[first]);
        //             addval.add(nums[second]);
        //             Collections.sort(addval);
        //             if(res.contains(addval)==false){
        //                 res.add(addval);
        //             }
        //         }
        //         second++;
        //     }}
        // }
        // return res;
    }
}