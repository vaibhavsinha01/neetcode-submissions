class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        int l = 0;
        int r = 0;
        HashSet<Character> set = new HashSet<>();
        while(r<s.length()){
            // shrink the window if duplicate exists
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            result = Math.max(result,r-l+1);
            r++;
        }
        return result;
    }
}
