/**
 * @param {string} s
 * @return {number}
 */

// Given a string s, find the length of the longest substring without repeating characters.

 

// Example 1:

// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.
// Example 2:

// Input: s = "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1.
// Example 3:

// Input: s = "pwwkew"
// Output: 3
// Explanation: The answer is "wke", with the length of 3.
// Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

// map1.set('a', 1);
// map1.set('b', 2);
// map1.set('c', 3);

// console.log(map1.get('a'));
// // expected output: 1

var lengthOfLongestSubstring = function(s) {
    //substringis the length of a smaller string inside a string
    //possibly use binary search
    //hash map
    
    let size = s.length;
    
    let map = {};
    let start = 0;
    let maxLen = 0;
    let arr = s.split('');
    
    if (size == 0){
        return 0;
    }
    for(let i = 0; i < size; i++){
        let current = map[arr[i]];
        
        if (current != null && start <= current) {
            start = current + 1;
        } else {
            maxLen = Math.max(maxLen, i - start + 1);
        }
        
        map[arr[i]] = i;
    }
    
    return maxLen;
};