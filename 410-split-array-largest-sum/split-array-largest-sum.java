class Solution {
    public int checkSub(int[] nums, int maxSum){
        int currSum=0;
        int totalSub =0;
        for(int i: nums){
            currSum += i;
            if(currSum > maxSum){
                totalSub++;
                currSum = i;
            }
        }
        totalSub++;
        return totalSub;
    }
    public int splitArray(int[] nums, int k) {
        int max = 0;
        int sum = 0;
        for(int i: nums){
            sum+= i;
            if(max < i) max = i;
        }
        int low = max;
        int high = sum;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(checkSub(nums, mid) > k){
                low = mid+1;
            } 
            else high = mid-1;
        }
        return low;
        // int i;
        // for(i=max; i<=sum; i++){
        //     if(checkSub(nums, i) > k) continue;
        //     else break;
        // }
        // return i;
    }
}