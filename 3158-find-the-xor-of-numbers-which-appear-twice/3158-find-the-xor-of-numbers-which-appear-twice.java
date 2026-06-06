class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int unique=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                unique^=nums[i];
            }
        }
        return unique;
    }
}