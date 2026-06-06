class Solution {
    public int[] leftRightDifference(int[] nums) {
        int left[]=new int[nums.length];
        int right[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int lsum=0;
            for(int j=0;j<i;j++){
                lsum+=nums[j];
                left[i]=lsum;
            }
        }
        for(int i=0;i<nums.length;i++){
            int rsum=0;
            for(int j=i+1;j<nums.length;j++){
                rsum+=nums[j];
                right[i]=rsum;
            }
        }
        int result[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            result[i]=Math.abs(left[i]-right[i]);
        }
        return result;
    }
}