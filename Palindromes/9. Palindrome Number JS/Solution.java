class Solution {
    public boolean isPalindrome(int x) {
        int reversed = 0;
        int x2 = x;
        if(x < 0){
            return false;
        }
        while(x != 0){
            // get last digit from num
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            // remove the last digit from num
            x /= 10;
        }
        if(reversed == x2){
                return true;
        }
        return false;
    }
}
