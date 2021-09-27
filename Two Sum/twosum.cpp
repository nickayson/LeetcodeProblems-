class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        map<int, int> m;    //declared hash map for time complexity
        vector<int> v;      //declared vector
        
        for(int i = 0; i < nums.size(); i++) // goes through array
        {
            if(m.find(target-nums[i])!=m.end()) // if map finds key (target - an element in array) does not equal to the end key of the map 
            {
                v.push_back(m[target-nums[i]]); //push that value in the map to the vector
                v.push_back(i);                 //push the array number to the end
                return v;                       //return the values in the vector
            }
            m[nums[i]] = i; //update map to next element in the array     
        }
        return v;
    }
};