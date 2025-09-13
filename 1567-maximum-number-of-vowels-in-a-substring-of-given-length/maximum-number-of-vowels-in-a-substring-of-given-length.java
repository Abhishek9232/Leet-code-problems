class Solution {
    public boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public int maxVowels(String s, int k) {
        int maxVowel=0;
        int left=0;
        int right=0;
        int vowel=0;
        while(right<s.length())
        {
            if(isVowel(s.charAt(right)))vowel++;
            if((right-left+1) == k){
                maxVowel=Math.max(maxVowel,vowel);
                if(isVowel(s.charAt(left)))vowel--;
                left++;
            }
            right++;
        }
        return maxVowel;
    }
}