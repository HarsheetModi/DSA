class Solution {
    public int max(int[] piles){
        int max = 0;
        for(int i: piles){
            if(i > max){
                max = i;
            }
        }
        return max;
    }

    public int findh(int[] piles, int hourly){
        int totalhrs = 0;
        for(int i: piles){
            totalhrs += Math.ceil((double)i/(double)hourly);
        }
        return totalhrs;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int max = max(piles);

        int low = 1;
        int high = max;
        int ans = 0;
        while(low<=high){
            int mid = low + (high-low)/2;
            int hourly = findh(piles, mid);
            if(hourly<=h){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;    
    }
}