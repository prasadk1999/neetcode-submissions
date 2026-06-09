/**
-  Create 2 hashmaps where key = character and value is its occurence count
- Loops first hashmap and check if it is present exactly in the 2nd hashmap
*/

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        
        Map<Character,Integer> sMap = new HashMap();
        Map<Character, Integer> tMap = new HashMap();

        for(int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(sMap.containsKey(sChar)){
                int oldValue = sMap.get(sChar);
                sMap.put(sChar, oldValue + 1);
            }
            else{
                sMap.put(sChar, 1);
            }

            if(tMap.containsKey(tChar)){
                int oldValue = tMap.get(tChar);
                tMap.put(tChar, oldValue + 1);
            }
            else{
                tMap.put(tChar, 1);
            }
        }

       for (Map.Entry<Character, Integer> entry : sMap.entrySet()) {
            Character key = entry.getKey();
            int value = entry.getValue();
            if(!(tMap.containsKey(key) && tMap.getOrDefault(key, null) == value)){
                return false;
            }
        };

        return true;
        
    }
}
