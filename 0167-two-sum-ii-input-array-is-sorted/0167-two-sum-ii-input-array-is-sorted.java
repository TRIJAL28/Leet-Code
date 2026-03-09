class Solution {
    public int[] twoSum(int[] arr, int target) {
        for(int i=0;i<arr.length;i++) {
            int sum = 0;
            for (int j = i+1; j < arr.length; j++) {
                sum = arr[i] + arr[j];
                if (sum == target) {
                    return new int[]{i+1,j+1};
                }
            }
        }
        return new int[]{};
    }
}