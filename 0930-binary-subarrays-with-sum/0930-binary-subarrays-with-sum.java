class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        // int left=0;
        // int right=0;
        // int count=0;
        // //int sum=0;
        // while(right<nums.length){
        //     int sum=0;
        //     sum+=nums[right];
        //     if(sum==goal){
        //         count++;
        //     }
        //     right++;
        // }
        // return count;
        int count=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
               
                sum+=nums[j];
                if(sum==goal){
                    count++;
                }
                
            }
        }
        return count;
    }

}