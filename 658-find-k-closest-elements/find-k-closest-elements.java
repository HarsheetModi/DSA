class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> result = new ArrayList<>();
        boolean[] boolArray = new boolean[arr.length];
        
        for(int i =0;i<k;i++){
            int min_diff = Integer.MAX_VALUE;
            int min_diff_idx=-1;
            for(int j=0;j<arr.length;j++){
                if(boolArray[j]==false && Math.abs(arr[j]-x)<min_diff){
                    min_diff = Math.abs(arr[j]-x);
                    min_diff_idx = j;
                }
            }
            if(min_diff_idx != -1){
                result.add(arr[min_diff_idx]);
                boolArray[min_diff_idx] = true;
            }
        }
        Collections.sort(result);
        return result;
    }
}