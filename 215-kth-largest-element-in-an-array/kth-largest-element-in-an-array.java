class Solution {
    public int findKthLargest(int[] nums, int k) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        // for(int i =0;i<nums.length;i++){
        //     pq.add(nums[i]);
        // }
        // int res =0;
        // while(k>0){
        //     res = pq.poll();
            
        //     k--;
        //     if(k==0){
        //         return res;
        //     }
        // }
        // return 0;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            minHeap.offer(nums[i]);
        }
        
        for (int i = k; i < nums.length; i++) {
            if (nums[i] > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(nums[i]);
            }
        }
        
        return minHeap.peek();
    }
}