class Solution {
    public int first(int[] nums, int low, int high, int target){
        int ans = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
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
    public int last(int[] nums, int low, int high, int target){
        int ans = nums.length;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid] > target){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        int lb = first(nums, 0, nums.length-1, target);
        ans[0] = -1;
        ans[1] = -1;
        if(lb == -1 || lb == nums.length || nums[lb] != target) return ans;
        int up = last(nums, 0, nums.length-1, target);
        ans[0] = lb;
        ans[1] = up-1;
        
        return ans;
    }
}