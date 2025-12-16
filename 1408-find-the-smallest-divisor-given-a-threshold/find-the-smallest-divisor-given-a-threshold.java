class Solution {
    public int calSum(int[] nums, int divisor, int threshold){
        int total = 0;
        for(int i: nums){
            total += Math.ceil((double)i/(double)divisor);
        }
        return total;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int max = 0;
        for(int i: nums){
            if(max < i) max = i;
        }    
        int ans = -1;
        int low =1, high = max;
        while(low<=high){
            int mid = low + (high-low)/2;
            int cal = calSum(nums, mid, threshold);
            if(cal<=threshold){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
        // for(int i=1; i<=max; i++){
        //     int cal = calSum(nums, i, threshold);
        //     if(cal <= threshold){
        //         return i;
        //     }
        // }
        // return -1;
    }
}