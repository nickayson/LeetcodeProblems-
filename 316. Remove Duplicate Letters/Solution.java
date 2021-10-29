public class Solution {
    public String removeDuplicateLetters(String s) {
        char[] array = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < array.length; i++) {
            char c = array[i];
            map.put(c, i);
        }
        char[] result = new char[map.size()];
        int start = 0;
        for (int i = 0; i < result.length; i++) {
            
            int end = findMinPos(map); //calls other function to find position
            
            char min = 'z' + 1;
            for (int j = start; j <= end; j++) {
                if (map.containsKey(array[j]) && array[j] < min) {
                    min = array[j];
                    start = j + 1;
                }
            }
            result[i] = min;
            map.remove(min);
        }
        
        return String.valueOf(result);
    }
    
    private int findMinPos(HashMap<Character, Integer> map) {
        int pos = Integer.MAX_VALUE;
        for (Integer end : map.values()) {
            pos = Math.min(pos, end);
        }
        return pos;
    }
}

// Given a string s, remove duplicate letters so that every letter appears once and only once. You must make sure your result is the smallest in lexicographical order among all possible results.

 

// Example 1:

// Input: s = "bcabc"
// Output: "abc"
// Example 2:

// Input: s = "cbacdcbc"
// Output: "acdb"
 

// Constraints:

// 1 <= s.length <= 104
// s consists of lowercase English letters.