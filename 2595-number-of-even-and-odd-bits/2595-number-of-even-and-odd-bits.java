class Solution {
    public int[] evenOddBit(int n) {
        ArrayList<Integer> list=new ArrayList<>();
        int[] arr=new int[2];
        int temp=n;
        while(temp>0){
            int rem=temp%2;
            list.add(rem);
            temp=temp/2;
        } 
        for(int i=0;i<list.size();i++){
            if(list.get(i)==1 && i%2==0){
                arr[0]+=1;
            }
            else{
                if(list.get(i)==1 && i%1==0){
                    arr[1]+=1;
                }
            }
        }
        return arr;
    }
}