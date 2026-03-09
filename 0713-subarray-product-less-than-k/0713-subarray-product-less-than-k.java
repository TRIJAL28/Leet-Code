class Solution {
    public int numSubarrayProductLessThanK(int[] arr, int k) {
        int count=0;
       
        for(int i=0;i<arr.length;i++){
            int product=1;
            for(int j=i;j<arr.length;j++){
                product=product*arr[j];
                if(product<k){
                    count++;
                }
                else{
                    break;
                }
            }
        }
        return count;
    }
}