class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] ch=new char[s.length()];
        for(int i=0;i<s.length();i++){
            ch[i]=s.charAt(i);
        }
        int[] freq=new int[128];
        int idx=0;
        int left=0;
        int maxlen=0;
        int right=0;
        while(right<ch.length){
            idx=ch[right];
            freq[idx]++;
            while(freq[idx]==2){
                freq[ch[left]]--;
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
            right++;
        }
        return maxlen;
    }
}