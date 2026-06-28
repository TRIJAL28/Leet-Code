class Solution {
    public int numberOfSubstrings(String s) {
        char[] ch=new char[s.length()];
        for(int i=0;i<s.length();i++){
            ch[i]=s.charAt(i);
        }
        int[] freq=new int[3];
        int left=0;
        int count=0;
        int right=0;
        while(right<ch.length){
            int idx=ch[right]-'a';
            freq[idx]++;
            while(freq[0]>0 && freq[1]>0 && freq[2]>0){
                count+=ch.length-right;
                int idx2=ch[left]-'a';
                freq[idx2]--;
                left++;
            }
            right++;
        }
        return count;
    }
}