class Solution {
    public int insert(int[] nums, int low, int high, int target){
        int ans = nums.length;
        while(low<=high){
            int mid = high - (high-low)/2;
            if(nums[mid] >= target){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
    public int searchInsert(int[] nums, int target) {
        return insert(nums, 0, nums.length-1, target);
    }
}