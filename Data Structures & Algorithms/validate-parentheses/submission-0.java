class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        char[] ch = s.toCharArray();
        for(char c : ch){
            if(c=='{' || c=='[' || c=='('){
                st.push(c);
            }
            else{
                if(st.size() == 0) return false;
                char t = st.peek();
                if((t=='{' && c=='}') || (t=='[' && c==']') || (t=='(' && c==')')){
                    st.pop();

                }
                else{
                    return false;
                }
            }
        }
        return st.size()==0;

        
    }
}
