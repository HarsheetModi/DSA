class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        // int[] aux = new int[nums.length+1];
        // List<Integer> ans = new ArrayList<>();
        // for(int n: nums){
        //     aux[n] = aux[n]+1;
        // }
        // for(int i =0;i<aux.length;i++){
        //     if(aux[i]>1){
        //         ans.add(i);
        //     }
        // }
        // return ans;

        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for(int n: nums){
            map.put(n, map.getOrDefault(n, 0)+1);
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue()>1)
                ans.add(entry.getKey());
        }

        return ans;
    }
}