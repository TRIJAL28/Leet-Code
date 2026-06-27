class Solution {
    public int totalFruit(int[] fruits) {
        int[] freq=new int[fruits.length];
        int left=0;
        int right=0;
        int count=0;
        int maxlen=0;
        while(right<fruits.length){
            int idx=fruits[right];
            if(freq[idx]==0){
                count++;
            }
            freq[idx]++;
            while(count>2){
                int idx2=fruits[left];
                freq[idx2]--;
                if(freq[idx2]==0){
                    count--;
                }
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
            right++;
        }
        return maxlen;
    }
}