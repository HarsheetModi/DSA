class Solution {
    public int removeDuplicates(int[] nums) {
        //brute force
        //0(NlogN) insetion for set
        //0(N) for retrieval from set
        //total time: 0(NlogN + N)
        // Set<Integer> set = new LinkedHashSet<>();
        // for(int i=0; i<nums.length; i++){
        //     set.add(nums[i]);
        // }

        // int index = 0;
        // for(Integer s: set){
        //     nums[index++] = s;
        // }

        // return set.size();


        // optimal solution
        int position = 0;
        for(int i =1; i<nums.length; i++){
            if(nums[position] != nums[i]){
                
                nums[position+1] = nums[i];
                position++;
            }
        }
        return position+1;
    }
}