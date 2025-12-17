class Solution {
    public boolean isIsomorphic(String s, String t) {
        // Map<Character, Character> maps = new HashMap<>();
        // Map<Character, Character> mapt = new HashMap<>();
        // for(int i=0; i<s.length(); i++){
        //         if(!maps.containsKey(s.charAt(i))){
        //             maps.put(s.charAt(i), t.charAt(i));
        //         }
        //         if(!mapt.containsKey(t.charAt(i))){
        //             mapt.put(t.charAt(i), s.charAt(i));
        //         }
        //     if(maps.get(s.charAt(i)) == t.charAt(i) && mapt.get(t.charAt(i)) == s.charAt(i)) continue;
        //     else return false;
        // }
        // return true;
        int[] indexS = new int[200]; // Stores index of characters in string s
        int[] indexT = new int[200]; // Stores index of characters in string t
        
        // Get the length of both strings
        int len = s.length();
        
        // If the lengths of the two strings are different, they can't be isomorphic
        if(len != t.length()) {
            return false;
        }
        
        // Iterate through each character of the strings
        for(int i = 0; i < len; i++) {
            // Check if the index of the current character in string s
            // is different from the index of the corresponding character in string t
            if(indexS[s.charAt(i)] != indexT[t.charAt(i)]) {
                return false; // If different, strings are not isomorphic
            }
            
            // Update the indices of characters in both strings
            indexS[s.charAt(i)] = i+1; // updating index of current character
            indexT[t.charAt(i)] = i+1; // updating index of current character
        }
        
        // If the loop completes without returning false, strings are isomorphic
        return true;
    }
}