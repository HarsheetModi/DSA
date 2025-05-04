class Solution {
    // void heapify(int[] arr, int size, int loc){
    //     int lt = (2*loc)+1, rt=(2*loc)+2, smallest=loc;
    //     if(lt<size && arr[lt]<arr[smallest]){
    //         smallest = lt;
    //     }
    //     if(rt<size && arr[rt]<arr[smallest]){
    //         smallest = rt;
    //     }
    //     if(loc!=smallest){
    //         int a = arr[smallest];
    //         arr[smallest] = arr[loc];
    //         arr[loc] = a;
    //         heapify(arr, size, loc);
    //     }
    // }
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        int[] ans = new int[nums.length];
        for(int i =0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        for(int i =0;i<nums.length;i++){
            ans[i] = pq.poll();
        }
        return ans;
    }
}