class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        //int j=mat.length-1-i;
        for(int i=0;i<mat.length;i++){
            int j=mat.length-1-i;
            sum+=mat[i][i];
            if(i!=j){
                sum+=mat[i][j];
            }
        }
        return sum;
    }
}