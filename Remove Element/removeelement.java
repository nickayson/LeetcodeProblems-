class Solution {
    public int removeElement(int[] nums, int val) {
        //input val
        // take other elements and move to the front of nums
        // take out the value given
        int n = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == val)
            {
                n++;
            } else {
                nums[i-n] = nums[i];
            }
        }
        return nums.length - n;
    }
}
