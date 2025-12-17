class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        return (s + s).contains(goal);
        // int i;
        // for(i=0; i<s.length(); i++){
        //     if(s.charAt(i) == goal.charAt(0)){
        //         String s1 = s.substring(0,i);
        //         String s2 = s.substring(i);

        //         if((s2+s1).equals(goal)) return true;
        //     }
        // }
        // return false;
    }
}