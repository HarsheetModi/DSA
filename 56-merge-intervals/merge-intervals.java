class Solution {
    public void sortArray(int[][] intervals){
        int len = intervals.length;

        for(int i =0; i<len; i++){
            int min_idx = i;
            for(int j=i+1; j<len; j++){
                if(intervals[j][0] < intervals[min_idx][0]){
                    min_idx = j;
                }
            }
            int temp[] = intervals[i];
            intervals[i] = intervals[min_idx];
            intervals[min_idx] = temp;
        }
    }
    public int[][] merge(int[][] intervals) {
        sortArray(intervals);
        List<List<Integer>> result = new ArrayList<>();

        result.add(new ArrayList<>(Arrays.asList(intervals[0][0], intervals[0][1])));
    
        for(int i=1; i<intervals.length; i++){
            if(intervals[i][0] > result.get(result.size()-1).get(1)){
                result.add(new ArrayList<>(Arrays.asList(intervals[i][0], intervals[i][1])));
            }
            else{
                result.get(result.size()-1).set(1, Math.max(intervals[i][1], result.get(result.size()-1).get(1)));
            }
        }
        int rows = result.size();
        int cols = result.get(0).size(); 
        int[][] res = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                res[i][j] = result.get(i).get(j);
            }
        }
        return res;

    }
}