class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int left=0;
        int right=k-1;
        int last=cardPoints.length-1;
        int sum=0;
        for(int i=left;i<=right;i++){
            sum+=cardPoints[i];
        }
        int max=sum;
        while(right>=0){
            sum-=cardPoints[right];
            right--;
            sum+=cardPoints[last];
            last--;
            max=Math.max(max,sum);
        }
        return max;
    }
}