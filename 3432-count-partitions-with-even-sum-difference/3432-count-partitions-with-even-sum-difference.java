class Solution {
    public int countPartitions(int[] nums) {
        int total=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];//36
        }
        int l=0;
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            l+=nums[i];//10
            int ans=total-l;//26
            if((ans-l)%2==0){
                count++;
            }
        }
        return count;
    }
}