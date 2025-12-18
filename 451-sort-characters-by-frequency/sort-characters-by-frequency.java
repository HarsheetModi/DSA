class Solution {
    public String frequencySort(String s) {
        int[][] freq = new int[128][2];
        for(char c: s.toCharArray()){
            freq[c][0]++;
            freq[c][1] = c;
        }
        Arrays.sort(freq, (a, b) -> b[0] - a[0]);
        
        StringBuilder sb = new StringBuilder();
        for(int[] f : freq){
            sb.append(String.valueOf((char) f[1]).repeat(f[0]));
        }
        return sb.toString();
        
    }
}