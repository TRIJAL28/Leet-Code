class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<operations.length;i++){
            String top=operations[i];
            if(top.equals("C")){
                st.pop();
            }
            else if(top.equals("D")){
                int x=st.peek();
                st.push(x*2);
            }
            else if(top.equals("+")){
                int x=st.pop();
                int y=st.peek();
                st.push(x);
                st.push(x+y);
            }
            else{
                st.push(Integer.parseInt(top));
            }
        }
        int sum=0;
        for(int i=0;i<st.size();i++){
            sum+=st.get(i);
        }
        return sum;
    }
}