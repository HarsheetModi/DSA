class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                ArrayList<Integer> list = map.get(nums[i]);
                list.set(0, list.get(0) + 1);
                list.add(i);
            }
            else{
                ArrayList<Integer> values = new ArrayList<>();
                values.add(1);
                values.add(i);
                map.put(nums[i], values);
            }
        }
       

        for(int i =0; i<queries.length; i++){
            if(!map.containsKey(x)){
                queries[i] = -1;
            }
            else{
                ArrayList<Integer> list = map.get(x);
                int count = list.get(0);
                if(count >= queries[i]){
                    queries[i] = list.get(queries[i]);
                }
                else{
                    queries[i] = -1;
                }
            }
        }
        return queries;
    }
}