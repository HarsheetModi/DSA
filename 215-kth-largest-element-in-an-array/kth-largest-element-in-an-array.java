class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i =0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        int res =0;
        while(k>0){
            res = pq.poll();
            
            k--;
            if(k==0){
                return res;
            }
        }
        return 0;
    }
}