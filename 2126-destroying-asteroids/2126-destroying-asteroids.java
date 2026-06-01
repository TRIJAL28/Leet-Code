class Solution {
    public boolean asteroidsDestroyed(long mass, int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]>mass){
                return false;
            }
            mass=mass+nums[i];
        }
        return true;
    }
}