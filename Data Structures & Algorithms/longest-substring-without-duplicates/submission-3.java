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
       HashMap<Character, Integer> lastCharOccurence = new HashMap<>();
       int left = 0;
       int maxSubstrLen = 0;
       for(int right = 0; right < s.length(); right++){
            if(lastCharOccurence.containsKey(s.charAt(right)) && lastCharOccurence.get(s.charAt(right)) >= left)
                left = lastCharOccurence.get(s.charAt(right)) + 1;
        

            lastCharOccurence.put(s.charAt(right), right);
            int currLen = right - left + 1;
            maxSubstrLen = Math.max(currLen, maxSubstrLen);
        }

    return maxSubstrLen;
    }
}
