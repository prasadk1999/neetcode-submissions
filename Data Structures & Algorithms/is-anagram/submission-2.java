/**
-  Create 2 hashmaps where key = character and value is its occurence count
- Loops first hashmap and check if it is present exactly in the 2nd hashmap
*/

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        
        Map<Character,Integer> freqMap = new HashMap();

        for(int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
           
            freqMap.put(sChar, freqMap.getOrDefault(sChar, 0) + 1);
            freqMap.put(tChar, freqMap.getOrDefault(tChar, 0) - 1);
        }

       for (int count : freqMap.values()) if(count != 0) return false;

        return true;
        
    }
}
