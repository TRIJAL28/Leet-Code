class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int left=0;
        int right=0;
        int dash=0;
        char[] ch=moves.toCharArray();
        for(int i=0;i<moves.length();i++){
            if(ch[i]=='L'){
                left++;
            }
            if(ch[i]=='R'){
                right++;
            }
            if(ch[i]=='_'){
                dash++;
            }
        }
        return Math.abs(right-left)+dash;
    }
}