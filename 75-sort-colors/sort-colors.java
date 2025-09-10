class Solution {
    public void sortColors(int[] nums) {
        int len = nums.length;
        for(int i=0; i<len-1; i++){
            boolean swap = false;

            for(int j=1; j<len; j++){
                if(nums[j] < nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                    swap = true;
                }
            }

            if(swap==false)
                break;
        }




















        // for(int i =0; i<nums.length-1; i++){
        //     int min = i;

        //     for(int j =i+1; j<nums.length; j++){
        //         if(nums[j] < nums[min]){
        //             min = j;
        //         }
        //     }
            
        //     int temp = nums[i];
        //     nums[i] = nums[min];
        //     nums[min] = temp;
        // }
    }
}