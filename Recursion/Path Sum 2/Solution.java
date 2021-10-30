/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        //return a list
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        pathSum(root, targetSum, new ArrayList<Integer>(), list);
        return list;
    }
    //helper function
    public void pathSum(TreeNode root, int targetSum, List<Integer> sol, List<List<Integer>> list) {
        if(root == null){
            return ;
        }
        sol.add(root.val);
        if(root.left == null && root.right == null && targetSum == root.val){
            list.add(new ArrayList<Integer>(sol)); //adds every element in list you created into list to return
        } else {
            pathSum(root.left, targetSum - root.val, sol, list); //recursion
            pathSum(root.right, targetSum - root.val, sol, list);
        }
        sol.remove(sol.size() - 1); // removes the last to return the end
    }
}
