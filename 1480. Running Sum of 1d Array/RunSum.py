class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        
        newList = [0] * len(nums)
        
        newList[0] = nums[0]
        
        for i in range(1, len(nums)):
            newList[i] = newList[i - 1] + nums[i]
            
        return newList