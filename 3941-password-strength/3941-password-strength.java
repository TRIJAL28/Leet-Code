class Solution {
    public int passwordStrength(String password) {
        int strength=0;
        HashSet<Character> set=new HashSet<>();
        char[] ch=password.toCharArray();
        if(password.isEmpty()){
                return 0;
            }
        for(int i=0;i<ch.length;i++){
            if(set.contains(ch[i])){
                continue;
            }
            set.add(ch[i]);
            if(ch[i]>='a'&&ch[i]<='z'){
                strength+=1;
            }
            else if(ch[i]>='A'&&ch[i]<='Z'){
                strength+=2;
            }
            else if(ch[i]>='0'&&ch[i]<='9'){
                strength+=3;
            }
            else{
                strength+=5;
            }
        }
        return strength;
    }
}