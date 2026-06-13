class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        char ans;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<words.length;i++){
            int sum=0;
            char[] ch = words[i].toCharArray();
            for(int j=0;j<ch.length;j++){
            sum+=weights[ch[j]-'a'];
            }
            int r=sum%26;
            ans=(char)('z'-r);
            sb.append(ans);
        }
        return sb.toString();
    }
}