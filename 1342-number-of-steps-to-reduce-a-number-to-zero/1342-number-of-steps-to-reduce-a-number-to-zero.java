class Solution {
    public int numberOfSteps(int num) {
        int  count=0;
        int temp=num;
        while(temp>0){
            if(temp%2==0){
                count++;
                temp/=2;
            }
            else{
                // temp/=2;
                count++;
                temp-=1;
            }
        }
        return count;
    }
}