class Solution {
    public int findPeakElement(int[] nums) {
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]<nums[mid+1]){
                start=mid+1;
            }
            else {
                end=mid;
            }
        } 
        return start;
        // int max=Integer.MIN_VALUE;
        // int index = 0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i] > max){
        //         max = nums[i];
        //     }
        //     if(nums[i] == max){
        //         index = i;
        //     }

        // }
        // return index;
    }
}