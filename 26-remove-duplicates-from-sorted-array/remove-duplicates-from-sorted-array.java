class Solution {
    public int removeDuplicates(int[] nums) {
        //brute force
        Set<Integer> set = new LinkedHashSet<>();
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }

        int index = 0;
        for(Integer s: set){
            nums[index++] = s;
        }

        return set.size();

        // int position = 0;
        // for(int i =1; i<nums.length; i++){
        //     if(nums[position] != nums[i]){
        //         position++;
        //         nums[position] = nums[i];
        //     }
        // }
        // return position+1;
    }
}