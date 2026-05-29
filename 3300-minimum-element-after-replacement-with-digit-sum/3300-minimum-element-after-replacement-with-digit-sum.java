class Solution {
    public int minElement(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int sum=0;
            int temp=arr[i];
            while(temp>=1) {
                int rem = temp % 10;
                sum = sum + rem;
                temp= temp / 10;
            }
            arr[i]=sum;
        }
        Arrays.sort(arr);
        return arr[0];
    }
}