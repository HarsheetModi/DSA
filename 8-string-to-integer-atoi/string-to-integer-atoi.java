class Solution {
    public int myAtoi(String s) {
        if(s.length() == 0) return 0;
        int result = 1;
        int i = 0;
        Map<Character, Integer> map = new HashMap<>();
        map.put('1', 1);
        map.put('2', 2);
        map.put('3', 3);
        map.put('4', 4);
        map.put('5', 5);
        map.put('6', 6);
        map.put('7', 7);
        map.put('8', 8);
        map.put('9', 9);
        map.put('0', 0);
        char ch = s.charAt(i);
        while(ch == ' ' && i<s.length()){
            i++;
            if(i<s.length()) ch = s.charAt(i);
        }

        if(ch == '-'){
            result = -1;
            i++;
        }
        if(ch == '+') i++;
        if(i<s.length()){
            ch = s.charAt(i);
        }
        
        while(ch == '0' && i<s.length()){
            i++;
            if(i > s.length()) return 0;
            if(i < s.length()) ch = s.charAt(i);
        }
        if(map.containsKey(ch)){
            result = result * map.get(ch);
            i++;
        }
        else return 0;
        while(i < s.length()){
            ch = s.charAt(i);
            if(map.containsKey(ch)){
                if((long)result * 10 + map.get(ch) > Integer.MAX_VALUE) return Integer.MAX_VALUE;
                else if((long)result * 10 - map.get(ch) < Integer.MIN_VALUE) return Integer.MIN_VALUE;
                else if(result < 0) result = result * 10 - map.get(ch);
                else result = result * 10 + map.get(ch);
                i++;
            }
            else{
                return result;
            }
        }
        return result;
    }
}