class Solution {
    public int maxSubArray(int[] nums) {
        // has to have one number
        // find sum of all arrays
        // return largest
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            if (sum < 0)
            {
                sum = nums[i];
            }
            else 
            {
                sum = sum + nums[i];
            }
            if (sum > max)
            {
                max = sum;
            }
        }
        return max;
    }
}
