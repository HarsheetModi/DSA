class Solution {

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int integer: arr){
            if(k>0){
                minHeap.offer(integer);
                k--;
            }
            else if(Math.abs(minHeap.peek()-x)>Math.abs(integer-x)){
                minHeap.poll();
                minHeap.offer(integer);
            }
        }
        List<Integer> result = new ArrayList<>();
        while(!minHeap.isEmpty()){
            result.add(minHeap.poll());
        }
        return result;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // int start = 0;
        // int end = arr.length-1;
        // while(end - start >= k){
        //     if(Math.abs(arr[end]-x) < Math.abs(arr[start]-x)){
        //         start++;
        //     }
        //     else{
        //         end--;
        //     }
        // }
        // List<Integer> result = new ArrayList<>();
        // while(end-start >=0){
        //     result.add(arr[start]);
        //     start++;
        // }
        // return result;
    }

















    //     List<Integer> result = new ArrayList<>();
    //     boolean[] boolArray = new boolean[arr.length];
        
    //     for(int i =0;i<k;i++){
    //         int min_diff = Integer.MAX_VALUE;
    //         int min_diff_idx=-1;
    //         for(int j=0;j<arr.length;j++){
    //             if(boolArray[j]==false && Math.abs(arr[j]-x)<min_diff){
    //                 min_diff = Math.abs(arr[j]-x);
    //                 min_diff_idx = j;
    //             }
    //         }
    //         if(min_diff_idx != -1){
    //             result.add(arr[min_diff_idx]);
    //             boolArray[min_diff_idx] = true;
    //         }
    //     }
    //     Collections.sort(result);
    //     return result;
    // }
}