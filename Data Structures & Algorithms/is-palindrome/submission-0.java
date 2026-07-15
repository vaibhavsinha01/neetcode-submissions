class Solution {
    public boolean isPalindrome(String s) {
        String n = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        StringBuilder sb = new StringBuilder(n);
        if(sb.reverse().toString().equals(n)){
            return true;
        }
        return false;
    }
}