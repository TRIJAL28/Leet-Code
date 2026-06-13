class Solution {
    public int absDifference(int[] nums, int k) {
        int min=0;
        int max=0;
        Arrays.sort(nums);
        for(int i=0;i<k;i++){
            min+=nums[i];
        }
        for(int i=nums.length-1;i>=nums.length-k;i--){
            max+=nums[i];
        }
        return Math.abs(min-max);
    }
}