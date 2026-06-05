class Solution {
    public int bitwiseComplement(int n) {
        if(n==0) return 1;
        ArrayList<Integer> list=new ArrayList<>();
        int temp=n;
        while(temp>0){
            int rem=temp%2;
            list.add(rem);
            temp=temp/2;
        }
        for(int i=0;i<list.size();i++){
            if(list.get(i)==1){
                list.set(i,0);
            }
            else{
                list.set(i,1);
            }
        }
        int val=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)==1){
            val+=(int)Math.pow(2,i);
            }
        }
        return val;
    }
}