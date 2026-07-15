class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int max_repeating = 0;
        int max_char_count = 0;
        int[] freq = new int[26];

        for(int r=0;r<s.length();r++){
            freq[s.charAt(r) - 'A']++;
            max_char_count = Math.max(max_char_count,freq[s.charAt(r) - 'A']);

            while((r-l+1) - max_char_count > k){
                freq[s.charAt(l)-'A']--;
                l++;
            }
            max_repeating = Math.max(max_repeating,r-l+1);
        }
        return max_repeating;
    }
}
