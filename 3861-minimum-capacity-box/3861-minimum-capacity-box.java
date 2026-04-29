class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int min=Integer.MAX_VALUE;
        int index=-1;
        for(int i=0;i<capacity.length;i++){
            if(capacity[i]>=itemSize && capacity[i]<min){
                min=capacity[i];
                index=i;
            }
        }
        return index;
    }
}


// class Solution {
//     public int minimumIndex(int[] capacity, int itemSize) {
//         int min =Integer.MAX_VALUE;
//         for(int i =0;i<capacity.length;i++){
//             if(capacity[i] >= itemSize){
//                 min=Math.min(capacity[i],min);
//             }
//         }
//         if(min==Integer.MAX_VALUE){
//             return -1;
//         }
//         int ans =0;
//         for(int i =0;i<capacity.length;i++){
//             if(capacity[i]==min){
//                 ans = i;
//                 break;
//             }
//         }
//         return ans;        
//     }
// }