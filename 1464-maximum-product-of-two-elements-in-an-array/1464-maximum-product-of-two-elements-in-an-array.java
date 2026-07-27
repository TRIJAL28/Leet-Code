class Solution {
    public int maxProduct(int[] nums) {
        // int product=1;
        // int max=0;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<nums.length;j++){
        //         product=(nums[i]-1)*(nums[j]-1);
        //         product=Math.max(max,product);
        //     }
        // }
        // return product;
        Arrays.sort(nums);
        int n=nums.length;
        return (nums[n-1]-1)*(nums[n-2]-1);
    }
}