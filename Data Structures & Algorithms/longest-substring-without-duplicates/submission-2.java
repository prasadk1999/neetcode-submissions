/**
Steps:
- Create a hashmap<Character, Integer>.
- Create a longest_substr Integer variable = 0
- Create a temp_subst_len integer variable = 0
- Loop the string
    - get the character[i]. Check if the character exist in hashmap
        - If exists, then check if temp_subst_len > longest_substr:
            - If yes, then update the longest_substr value
            - If not, then ignore
            - reset temp_subst_len = 0
        - If not exists, then increase the value of temp+subst_len by 1.
    - check if temp_subst_len > longest_substr:
        - If yes, then update the longest_substr value
        - If not, then ignore
- Return the value of longest_substr
*/
class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Character> charOccurence = new ArrayList<>();
        int longestSubstr = 0;
        int tempSubstrLen = 0;
        for(int i = 0; i < s.length(); i++){
            if(charOccurence.contains(s.charAt(i))){
                // character is repeated, hence reset the temp count
                if(tempSubstrLen > longestSubstr)
                    longestSubstr = tempSubstrLen;
                
                //charOccurence.clear();
                    charOccurence.subList(0,charOccurence.indexOf(s.charAt(i))+1).clear();
                tempSubstrLen = 0;
                //continue;
            }

            charOccurence.add(s.charAt(i));
            tempSubstrLen = charOccurence.size();
            if(tempSubstrLen > longestSubstr)
                longestSubstr = tempSubstrLen;
        }

        return longestSubstr;
    }
}
