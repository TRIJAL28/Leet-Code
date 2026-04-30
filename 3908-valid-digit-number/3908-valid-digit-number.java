class Solution {
    public boolean validDigit(int n, int x) {
        // boolean ans=false;
        // int temp=n;
        // while(n>0){
        //     temp=n%10;
        //     if(temp==x){
        //         ans=true;
        //     }
        // }
        // if(temp==x){
        //     return false;
        // }
        // else{
        //     return ans;
        // }
        String s=String.valueOf(n);
        char ch=(char)(x+'0');
        if(s.charAt(0)==ch) return false;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==ch){
                return true;
            }
        }
        return false;
    }
}