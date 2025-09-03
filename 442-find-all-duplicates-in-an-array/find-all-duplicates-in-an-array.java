class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int[] aux = new int[nums.length+1];
        List<Integer> ans = new ArrayList<>();
        for(int n: nums){
            aux[n] = aux[n]+1;
        }
        for(int i =0;i<aux.length;i++){
            if(aux[i]>1){
                ans.add(i);
            }
        }
        return ans;
    }
}