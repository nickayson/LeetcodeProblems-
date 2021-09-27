class Solution {
    public boolean isPalindrome(int x) {
        //go trhough integer
        // check if it is a plaindrome
        if (x < 0){
            return false;
        }
        int reversed = 0; 
        int original = x;
        int remainder;
        while(x != 0){
            remainder = x % 10;
            reversed = reversed * 10 + remainder; 
            x = x/10;
        }
        return original == reversed;
    }
}