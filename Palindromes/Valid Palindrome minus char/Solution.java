class Solution {
    public boolean validPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            int left = i, right = n - i - 1;
            //check to see if it is a palindrome
            if (s.charAt(left) != s.charAt(right)) { 
                // give a last chance
                // delete char at left
                if (validSubPalindrome(s, left + 1, right)) return true;
                // delete char at right
                return validSubPalindrome(s, left, right - 1);
            }
        }
        return true;
    }
    
    private boolean validSubPalindrome(String s, int lo, int hi) {
        int n = hi - lo + 1;
        for (int i = 0; i < n / 2; i++) {
            int left = lo + i, right = hi - i;
            if (s.charAt(left) != s.charAt(right)) return false;
        }
        return true;
    }
}