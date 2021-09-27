class Solution {
public:
    int reverse(int x) {
        int rev = 0;
        while(x != 0){ // while input is not zero
            //push onto back of reverse and pop it off the beginning
            int pop = x % 10;
            x /= 10;
            // // cases to keep it from overflowing
            if (rev > INT_MAX/10 || (rev == INT_MAX / 10 && pop > 7)) return 0;
            if (rev < INT_MIN/10 || (rev == INT_MIN / 10 && pop < -8)) return 0;
            
            rev = rev * 10 + pop;       //reverse is now updating to put the first element to the last
        }
        return rev;
    }
};