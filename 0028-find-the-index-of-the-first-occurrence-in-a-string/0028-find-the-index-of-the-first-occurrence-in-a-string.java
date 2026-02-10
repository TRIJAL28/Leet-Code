class Solution {
    public int strStr(String haystack, String needle) {
        return check(needle,haystack);
    }
     public static int check(String needle,String haystack){
         for (int i = 0; i <= haystack.length()-needle.length(); i++) {
    //         for (int j = i + 1; j <= haystack.length(); j++) {
    //             //String s=haystack
                 if(needle.equals(haystack.substring(i,i+needle.length()))){
                    return i;
                }
            }
            return -1;
        }
    //     return -1;
    //THIS WORKS TOOO:
    // if(haystack.contains(needle)){
    // return haystack.indexOf(needle);
    // }
    // return -1;
    // }

}