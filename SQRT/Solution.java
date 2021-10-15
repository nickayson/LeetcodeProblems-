class Solution {
    public int mySqrt(int x) {
        //get rid of decimal after
        //return non negative
        // use binary search = divide by half until you find the area the number is in (upper or lower half)
        if (x == 0) return 0;
        
        int start = 1, end = x;
        
        while (start < end){
            int mid = start + (end- start) / 2;
            if(mid <= (x / mid) &&  (mid + 1) > x / (mid + 1) ) //first part is for finding the whole number and the second part is for the decimal
            {
                return mid; // only returns the middle number without decimal
            }
            else if (mid > x / mid) //looks through left side
            {
                end = mid;
            }
            else
            {
                start = mid + 1; // looks through right side
            }
        }
        return start;
    }
}