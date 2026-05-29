class Solution {
    public int minElement(int[] arr) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            int temp=arr[i];
            while(temp>=1) {
                int rem = temp % 10;
                sum = sum + rem;
                temp= temp / 10;
            }
            min=Math.min(min,sum);
        }
        // Arrays.sort(arr);
        return min;
    }
}