class Solution {
    public void swap(int[] nums, int start, int end){
        int len = end - start + 1;
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public void nextPermutation(int[] nums) {
        int i = nums.length - 1;
        while(i > 0 && nums[i-1] >= nums[i]){
            i--;
        }     

        if(i<=0){
            swap(nums, 0, nums.length-1);
            return;
        } 

        int j = nums.length-1;
        while(nums[j]<=nums[i-1]){
            j--;
        }
        int temp = nums[i-1];
        nums[i-1] = nums[j];
        nums[j] = temp;

        swap(nums, i, nums.length-1);

        

    }
}