class Solution {
    public int[] plusOne(int[] digits) {
        // iterate thorugh digits array backwards
        // add 1  to back
        // change last number and return array
        for (int i = digits.length - 1; i >=0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                break;
            } else {
                digits[i] = 0;
            }
        }
        //if the first digit is now 0 then make new array with an extra element slot and update to first element to 1
        if (digits[0] == 0) {
            int[] res = new int[digits.length+1];
            res[0] = 1;
            return res;
        }
        return digits;
    }
}