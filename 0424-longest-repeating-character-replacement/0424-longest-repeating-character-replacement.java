    class Solution {
        public int characterReplacement(String s, int k) {
            //s=s.toLowerCase();
            int[] freq=new int[26];
            char[] ch=new char[s.length()];
            for(int i=0;i<s.length();i++){
                ch[i]=s.charAt(i);
            }
            int left=0;
            int right=0;
            int maxlen=0;
            int maxfreq=0;
            // int idxc=0;
            while(right<ch.length){
                int idx=ch[right]-'A';
                // if(freq[idx]==0){
                //     idxc++;
                // }
                freq[idx]++;
                maxfreq=Math.max(maxfreq,freq[idx]);
                
                while(((right-left+1)-maxfreq)>k){
                    int idx2=ch[left]-'A';
                    freq[idx2]--;
                    // if(freq[idx2]==0){
                    //     idxc--;
                    // }
                    left++;
                }
                maxlen=Math.max(maxlen,right-left+1);
                right++;
            }
            return maxlen;
        }
    }