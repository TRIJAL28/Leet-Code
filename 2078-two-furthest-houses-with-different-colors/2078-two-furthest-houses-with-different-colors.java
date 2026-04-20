class Solution {
    public int maxDistance(int[] colors) {
        int max=0;
        for(int i=0;i<colors.length;i++){
            for(int j=1;j<=colors.length-1;j++){
                if(colors[i]!=colors[j]){
                    max=Math.max(Math.abs(i-j),max);
                }
            }
        }
        return max;
    }
}