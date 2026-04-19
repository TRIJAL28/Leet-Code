class Solution {
    public boolean judgeCircle(String moves) {
        int x=0;
        int y=0;
        char[] ch=moves.toCharArray();
        for(int i=0;i<moves.length();i++){
            if(ch[i]=='U'){
                y++;
            }
            if(ch[i]=='D'){
                y--;
            }
            if(ch[i]=='R'){
                x++;
            }
            if(ch[i]=='L'){
                x--;
            }
        }
        if(x==0 && y==0){
            return true;
        }
        return false;
    }
}