class Solution {
    public boolean checkOdd(int num){
        if(num % 2 !=0) return true;
        return false;
    }
    public String largestOddNumber(String num) {
        int i = num.length()-1;
        while(i >= 0){
            int ch = num.charAt(i) - '0';
            if(checkOdd(ch)) break;
            i--;        
        }

        if(i < 0) return "";
        return num.substring(0, i+1);    
    }
}