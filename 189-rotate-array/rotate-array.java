class Solution {
    public void reverse(int[] nums, int first, int last){
        while(first<last){
            int temp = nums[first];
            nums[first] = nums[last];
            nums[last] = temp;
            first++;
            last--;
        }
    }
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length-k-1);
        reverse(nums, nums.length-k, nums.length-1);
        reverse(nums, 0, nums.length-1);

        //brute force approach
        //0(k) + 0(n-k) + 0(k) = 0(n+k)
        // if(nums.length<k){k = k % nums.length;}
        // int[] temp = new int[nums.length-k];

        // for(int i=0; i<nums.length-k; i++){
        //     temp[i] = nums[i];
        // }

        // for(int i=nums.length-k; i<nums.length; i++){
        //     nums[i-(nums.length-k)] = nums[i];
        // }

        // for(int i=k, j=0; i<nums.length; i++){
        //     nums[i] = temp[j];
        //     j++;
        // }


    }
}