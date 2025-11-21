class Solution {
    public int removeDuplicates(int[] nums) {
        int position = 0;
        for(int i =1; i<nums.length; i++){
            if(nums[position] != nums[i]){
                position++;
                nums[position] = nums[i];
            }
        }
        return position+1;
    }
}