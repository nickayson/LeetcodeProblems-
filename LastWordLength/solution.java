class Solution {
    public int lengthOfLastWord(String s) {
        // iterate through string
        // find last word
        // output length of last string
        String[] parts = s.split(" "); //split all string by whitespace
        String lastword = parts[parts.length - 1];
        int output = lastword.length();
        return output;
    }
}