class Solution {
    public int minimumCost(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        int count=0;
        for(int i=nums.length-1;i>=0;i--){
            count++;
            if(count%3!=0){
                sum=sum+nums[i];
            }
        }
        return sum;
    }
}