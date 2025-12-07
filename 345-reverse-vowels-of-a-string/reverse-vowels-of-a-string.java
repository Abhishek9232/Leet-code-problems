class Solution {
    public static boolean isVowel(char ch)
    {
        if(ch == 'i' || ch == 'o' || ch == 'a' || ch == 'e' || ch == 'u' || ch == 'A' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'E')
        {
            return true;
        }
        else
        return false;
    }
    public String reverseVowels(String s) {
        int n = s.length();
        char ch[] = s.toCharArray();
        int start =0;
        int end = n -1;
        while(start<end)
        {
            if(!isVowel(ch[start]))
            {
                start++;
            }
            else if(!isVowel(ch[end]))
            {
                end--;
            }
            else
            {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
        }
       return String.valueOf(ch);
    }
}