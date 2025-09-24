class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        char ch;

        // Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            freq[ch - 'a']++;
        }

        // Find first character with frequency 1
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}
