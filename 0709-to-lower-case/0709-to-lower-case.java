class Solution {
    public String toLowerCase(String s) {
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            
            char el = chars[i];
            if (el >= 65 && el <= 90) {
                chars[i] = (char) (el + 32);
            }
        }

        return new String(chars);
    }
}