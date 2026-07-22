class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits.length() == 0){
            return result;
        }
        backtrack(digits,0,new StringBuilder(),result);
        return result;
    }
    public void backtrack(String digits,int index,StringBuilder current,List<String> result){
        if(index == digits.length()){
            result.add(current.toString());
            return;
        }
        String letters = getdigit(digits.charAt(index)-'0');

        for(int i=0;i<letters.length();i++){
            current.append(letters.charAt(i));
            backtrack(digits,index+1,current,result);
            current.deleteCharAt(current.length()-1);
        }
    }
    public String getdigit(int i){
        if(i==2){
            return "abc";
        }else if(i==3){
            return "def";
        }else if(i==4){
            return "ghi";
        }else if(i==5){
            return "jkl";
        }else if(i==6){
            return "mno";
        }else if(i==7){
            return "pqrs";
        }else if(i==8){
            return "tuv";
        }else{
            return "wxyz";
        }
    }
}
