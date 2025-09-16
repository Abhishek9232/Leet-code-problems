class Solution {
    public int firstUniqChar(String s) {
     /*   Map<Character,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);

        }
        for(int i=0;i<s.length();i++)
        {
            if(map.get(s.charAt(i))==1)
            {
                return i;
            }
        }
        return -1;
   */
   int [] freq = new int[26];
   char arr [] = s.toCharArray();
   for(char ch: arr)
   {
    freq[ch - 'a']++;
   }
   for(int i =0;i<arr.length;i++)
   {
    if(freq[arr[i] -'a']==1)
    {
        return i;
    }
   }
   return -1;
    }
}