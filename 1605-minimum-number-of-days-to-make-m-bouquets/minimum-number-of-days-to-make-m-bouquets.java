class Solution {
    public int possible(int[] bloomDay, int day, int m, int k){
        int count = 0;
        int bouquet = 0;
        for(int i=0; i<bloomDay.length; i++){
            if(bloomDay[i] <= day){
                count++;
            }
            else{
                bouquet += count/k;
                count = 0;
            }
        }
        bouquet += count/k;
        
        return bouquet;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if(m*k > bloomDay.length) return -1;
        int min=Integer.MAX_VALUE, max=0;
        for(int i: bloomDay){
            if(min > i){
                min = i;
            }
            if(max < i){
                max = i;
            }
        }
        int ans =-1;
        while(min<=max){
            int mid = min + (max-min)/2;
            int bouquet = possible(bloomDay, mid, m, k);
            if(bouquet >= m){
                ans = mid;
                max = mid-1;
            }
            else{
                min = mid+1;
            }
        }
    
        return ans;
    }
}