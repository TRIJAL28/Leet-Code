class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int min=nums[0];
        int max=nums[nums.length-1];
        int maxn=1;
        for(int i=1;i<=min;i++){
            if(min%i==0 && max%i==0){
                maxn=i;
            }
        }
        return maxn;
    }
}