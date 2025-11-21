class Solution {
    public void moveZeroes(int[] nums) {
        int position=0, curr =0, count=0;
        while(curr<nums.length){
            if(nums[curr] == 0){
                curr++;
            }
            else{
                nums[position] = nums[curr];
                curr++;
                position++;
                count++;
            }
        }
        for(int i =count; i<nums.length; i++){
            nums[i]=0;
        }

    }
}