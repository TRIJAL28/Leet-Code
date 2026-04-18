class Solution {
    public int mirrorDistance(int num) {
        int rev=0;
        int temp=num;
        while(num>0){
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        return Math.abs(temp-rev);
    }
}