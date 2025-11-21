class Solution {
    public int removeDuplicates(int[] nums) {
        int element = nums[0];
        int position = 1;
        for(int i =1; i<nums.length; i++){
            if(element != nums[i]){
                nums[position] = nums[i];
                element = nums[i];
                position++;
            }
        }
        return position;
    }
}