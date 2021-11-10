class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> sol = new ArrayList<Integer>(2);
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    sol.add(i);
                    sol.add(j);
                }
            }
        }
        int[] arr = new int[sol.size()];
              int index = 0;
        for (final Integer value : sol) {
            arr[index++] = value;
        }
        System.out.println(sol);
        return arr;
    }
}