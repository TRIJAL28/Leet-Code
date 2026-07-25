class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> list=new ArrayList<>();
        while(n>0){
            list.add(n%10);
            n=n/10;
        }
        int max=0;
        int product=0;
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                product=list.get(i)*list.get(j);
                max=Math.max(max,product);
            }
        }
        return max;
        // Collections.sort(list);
        // int product=list.get(list.size()-1)*list.get(list.size()-2);
        // return product;
    }
}