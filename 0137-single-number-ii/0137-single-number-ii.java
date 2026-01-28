class Solution {
    public int singleNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count==1){
                int n=nums[i];
                return n;
            }
        }
        return -1;
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length-1;i+=3){
        //     if(nums[i]!=nums[i+2]){
        //         return nums[i];
        //     }
        // }
        // return nums[nums.length-1];
    }
}