class Solution {
    public void moveZeroes(int[] nums) {
        int position=0, curr =0;
        while(curr<nums.length){
            if(nums[curr] == 0){
                curr++;
            }
            else{
                int temp = nums[position];
                nums[position] = nums[curr];
                nums[curr] = temp;
                curr++;
                position++;
            }
        }
        // for(int i =position; i<nums.length; i++){
        //     nums[i]=0;
        // }

    }
}