class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<operations.length;i++){
            String top=operations[i];
            if(top.equals("+")){
                int a=st.pop();
                int b=st.peek();
                st.push(a);
                st.push(a+b);
            }
            else if(top.equals("C")){
                st.pop();
            }
            else if(top.equals("D")){
                int c=st.peek();
                c=c*2;
                st.push(c);
            }
            else{
                st.push(Integer.parseInt(top));
            }
        }
        int x=0;
        for(int i=0;i<st.size();i++){
            x+=st.get(i);
        }
        return x;
    }
}