class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int flag = 0;
        for(char c:s.toCharArray()){
            if(st.isEmpty() && ((c == '}') || (c == ']') || (c == ')'))){
                return false;
            }
            if(c == '(' || c == '{' || c == '['){
                st.push(c);
            }
            else if(c == ')'){
                if(st.peek() == '('){
                    st.pop();
                }else{
                    return false;
                }
            }
            else if(c == '}'){
                if(st.peek() == '{'){
                    st.pop();
                }else{
                    return false;
                }
            }
            else if(c == ']'){
                if(st.peek() == '['){
                    st.pop();
                }else{
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
