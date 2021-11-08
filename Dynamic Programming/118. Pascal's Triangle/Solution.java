class Solution {
    public List<List<Integer>> generate(int numRows) {
       //every number is the sum of the 2 numbers above it
        //add 1 to list every time
        //find sum add it
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> sol = new ArrayList<Integer>();
        for(int i=0;i<numRows;i++)
        {
            sol.add(0, 1);
            System.out.println(sol);
            for(int j=1;j<sol.size()-1;j++){
			    sol.set(j, sol.get(j) + sol.get(j+1)); //replacing j position with sum of the previous 2
            }
            list.add(new ArrayList<Integer>(sol));
        }
        return list;
    }
}
// Given an integer numRows, return the first numRows of Pascal's triangle.

// In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:


 

// Example 1:

// Input: numRows = 5
// Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
// Example 2:

// Input: numRows = 1
// Output: [[1]]
