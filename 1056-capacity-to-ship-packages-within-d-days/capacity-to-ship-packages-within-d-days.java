class Solution {
    public int calDays(int[] weights, int cap){
        int total=0, curr=0;
        for(int i: weights){
            curr += i;
            if(curr > cap){
                total++;
                curr = i;
            }
        }
        total++;
        return total;
    }
    public int shipWithinDays(int[] weights, int days) {
        int sum = 0, minWeight=0;
        for(int i: weights){
            if(minWeight<i) minWeight = i;
            sum+= i;
        }
        int low = minWeight, high = sum;
        while(low<=high){
            int mid = low + (high-low)/2;
            int total = calDays(weights, mid);
            if(total > days){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return low;

        // for(int i=minWeight; i<=sum; i++){
        //     int total = calDays(weights, i);
        //     if(total <= days){
        //         return i;    
        //     }
        // }
        // return -1;
    }
}