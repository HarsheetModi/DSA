class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        int i = s.length() - 1;
        while(i >= 0){

            while(i >=0 && s.charAt(i) == ' '){
                i--;
            }

            if(i < 0) break;

            int end = i;

            while(i >=0 && s.charAt(i) != ' '){
                i--;
            }

            String word = s.substring(i+1, end+1);

            if(result.length() > 0){
                result.append(" ");
            }

            result.append(word);

        }

        return result.toString();
        

















        // ArrayList<String> words = new ArrayList<>();
        // StringBuilder word = new StringBuilder();

        // for(int i=0; i<s.length(); i++){
        //     if(s.charAt(i) != ' '){
        //         word.append(s.charAt(i));
        //     }
        //     else if(word.length() > 0){
        //         words.add(word.toString());
        //         word.setLength(0);
        //     }
        // }

        // if(word.length() > 0){
        //     words.add(word.toString());
        // }

        // Collections.reverse(words);

        // return String.join(" ", words);
    }
}