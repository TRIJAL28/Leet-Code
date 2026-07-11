class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int y=x;
        int sum=0;
        while(y>0){
            int rem=y%10;
            sum=sum+rem;
            y=y/10;
        }
        if(x%sum==0){
            return sum;
        }
        return -1;
    }
}