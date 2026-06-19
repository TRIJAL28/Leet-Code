class Solution {
    public int largestAltitude(int[] nums) {
         int n=0;
        int max=0;
        for(int i=0;i<=nums.length-1;i++){
            n+=nums[i];
            if(n>max){
                max=n;
            }
        }
        return max;
    }
}