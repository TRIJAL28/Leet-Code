class Solution {
    public boolean isPalindrome(String s) {
        String ns="";
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        for(int i=s.length()-1;i>=0;i--){
            ns=ns+s.charAt(i);
        }
        if(ns.equals(s)){
            return true;
        }
        return false;
    }
}