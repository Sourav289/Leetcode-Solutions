class Solution {
    public String firstPalindrome(String[] words) {

        for(int i = 0; i < words.length; i++) {

            String word = words[i];

            String rev = new StringBuilder(word).reverse().toString();

            if(word.equals(rev)) {
                return word;
            }
        }

        return "";
    }
}
