class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> maps = new HashMap<>();
        Map<Character, Character> mapt = new HashMap<>();
        for(int i=0; i<s.length(); i++){
                if(!maps.containsKey(s.charAt(i))){
                    maps.put(s.charAt(i), t.charAt(i));
                }
                if(!mapt.containsKey(t.charAt(i))){
                    mapt.put(t.charAt(i), s.charAt(i));
                }
            
            if(maps.get(s.charAt(i)) == t.charAt(i) && mapt.get(t.charAt(i)) == s.charAt(i)) continue;
            else return false;
        }
        return true;
    }
}