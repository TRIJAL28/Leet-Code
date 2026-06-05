class Solution {
    public String capitalizeTitle(String title) {
        String[] split=title.split(" ");
        for(int i=0;i<split.length;i++){
            if(split[i].length()<=2){
                split[i]=split[i].toLowerCase();
            }
            else{
            split[i]=split[i].substring(0,1).toUpperCase()+split[i].substring(1).toLowerCase();
        }
        }
        return String.join(" ",split);
    }
}