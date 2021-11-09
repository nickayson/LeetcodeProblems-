/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
 var twoSum = function(nums, target) {
    //using hashmap
	let hash = {};
	
	for(let i = 0; i < nums.length; i++) {
		const n = nums[i];      //n is gonna be updated
		if(hash[target - n] !== undefined) { //if map target - n (last element) is not undefined return hash map
			return [hash[target - n], i];
		}
		hash[n] = i;    //update hashmap
	}
    //else return empty
	return [];
};