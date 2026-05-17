class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String top=tokens[i];
            if(top.equals("+")){
                int a=st.pop();
                int b=st.pop();
                st.push(a+b);
            }
            else if(top.equals("-")){
                int c=st.pop();
                int d=st.pop();
                st.push(d-c);
            }
            else if(top.equals("*")){
                int e=st.pop();
                int f=st.pop();
                st.push(e*f);
            }
            else if(top.equals("/")){
                int g=st.pop();
                int h=st.pop();
                st.push(h/g);
            }
            else{
                st.push(Integer.parseInt(top));
            }
        }
        return st.peek();
    }
}