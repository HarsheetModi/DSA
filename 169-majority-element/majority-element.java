class Solution {
    public int majorityElement(int[] nums) {
        int maj = nums[0];
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(maj == nums[i]) count++;
            else{
                if(count == 0){
                    maj = nums[i];
                    count++;
                }
                else{
                    count--;
                }
            }
        }
        return maj;
        // Map<Integer, Integer> map = new HashMap<>();
        // int maj =0;
        // for(int i: nums){
        //     map.put(i, map.getOrDefault(i, 0)+1);
        // }

        // for(int i: map.keySet()){
        //     if(map.get(i)>nums.length/2){
        //         maj = i;
        //     }
        // }

        // return maj;
    }
}