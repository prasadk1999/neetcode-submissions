/*
- Create a function which checks if 2 strings are anagrams.
- Create a new subarray with 1st string of I/P as its element. Add it to the o/p array
- Loop the I/P array from 2nd element
- Then loop the output array and its internal array too. Check if it fits in any array. If so, append to the array
- If not, create a new subarray and add it to the O/P array
*/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> anagramGrpArr = new ArrayList();
        //anagramGrpArr.add(new ArrayList<String>(Arrays.asList(strs[0])));
        HashMap<String, ArrayList<String>> anagramStrMap = new HashMap<>();
        for(int i = 0; i <strs.length; i++){
            char[] inputAnagramCharArr = strs[i].toCharArray();
            Arrays.sort(inputAnagramCharArr);
            String sortedInputStr = new String(inputAnagramCharArr);

            anagramStrMap.computeIfAbsent(sortedInputStr, (k)-> new ArrayList<String>()).add(strs[i]);

            // boolean isInputStrAdded = false;
            // for(int j = 0; j < anagramGrpArr.size(); j++){
            //     List<String> anagramSubArr = anagramGrpArr.get(j);
            //     if(isAnagram(inputAnagramStr, anagramSubArr.get(0))){
            //         anagramSubArr.add(inputAnagramStr);
            //     }
            //     else{
            //         anagramGrpArr.add(new ArrayList<String>(Arrays.asList(inputAnagramStr)));
            //     }
            // }
        }
        return new ArrayList<>(anagramStrMap.values());
    }

    public boolean isAnagram(String str1, String str2){
        if(str1.length() != str2.length()) return false;

        HashMap<Character, Integer> freqMap = new HashMap<>();
        for(int i = 0; i < str1.length(); i++){
            
            freqMap.put(str1.charAt(i), freqMap.getOrDefault(str1.charAt(i), 0) + 1);
            freqMap. put(str1.charAt(i), freqMap.getOrDefault(str2.charAt(i), 0) - 1);
        }

        for(int count : freqMap.values()) if(count != 0) return false;

        return true;
    }
}
