public class SearchInsert {
    public static int search(int[] nums, int target) {
        // iterate through array
        // mark where the target is found
        // or where it should be
        int j = 0;
        int l = nums.length - 1;
        while(j <= l)
        {
            int mid = (j+l)/2;
            if (target < nums[mid])
            {
                l = mid - 1;
            }
            else if (target > nums[mid])
            {
                j = mid + 1;
            }
            else if (target == nums[mid])
            {
                return mid;
            }
        }
        return j;
    }
    public static void main(String[] args)
    {
        int[] nums = {1,3,5,6};
        int target = 5;
        search(nums, target);
    }
}


