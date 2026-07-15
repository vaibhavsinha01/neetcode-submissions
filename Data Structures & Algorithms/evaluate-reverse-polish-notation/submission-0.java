class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> s = new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")){
                int a = Integer.parseInt(s.pop());
                int b = Integer.parseInt(s.pop());
                s.push(String.valueOf(b+a));
            }
            else if(tokens[i].equals("-")){
                int a = Integer.parseInt(s.pop());
                int b = Integer.parseInt(s.pop());
                s.push(String.valueOf(b-a));
            }
            else if(tokens[i].equals("*")){
                int a = Integer.parseInt(s.pop());
                int b = Integer.parseInt(s.pop());
                s.push(String.valueOf(b*a));
            }
            else if(tokens[i].equals("/")){
                int a = Integer.parseInt(s.pop());
                int b = Integer.parseInt(s.pop());
                s.push(String.valueOf(b/a));
            }
            else{
                s.push(tokens[i]);
            }
        }
        return Integer.parseInt(s.pop());
    }
}
