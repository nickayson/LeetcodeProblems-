class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        // So the simplest solution using a HashMap is to simply throw all the data in there to start with, then iterate through all of the numbers to see if (target-num) is in there, and if it is, return {lower index, higher index}.
        for(int i = 0; i < nums.length; i++){
            Integer diff = (Integer)(target - nums[i]);
            if(map.containsKey(diff)){
                int toReturn[] = {map.get(diff), i};
                return toReturn;
            }

            map.put(nums[i], i);
        }
        return null;
    }
}