class Solution {
    public boolean isIsomorphic(String s, String t) {
       /* if(s.length()!=t.length())
        {
            return false;

        }
        Map<Character,Character> mapst= new HashMap<>();
         Map<Character,Character> mapts= new HashMap<>();
         for(int i =0;i<s.length();i++)
         {
            char c1= s.charAt(i);
            char c2 = t.charAt(i);
            if(mapst.containsKey(c1))
            {
                if(mapst.get(c1)!=c2)
                {
                    return false;
                }
            }
            else
            {
                mapst.put(c1,c2);
            }
            if(mapts.containsKey(c2))
            {
            if(mapts.get(c2)!=c1)
            {
                return false;
            }
         }
         else
         {
            mapts.put(c2,c1);
         }
         }
         
         return true;
         */
         int map1[] = new int[256];
         int map2[]= new int[256];
         for(int i =0;i<s.length();i++)
         {
            char c1= s.charAt(i);
            char c2=t.charAt(i);
            if(map1[c1]!=0 && map1[c1]!=c2 )
            {
                return false;
            }
            if(map2[c2]!=0 && map2[c2]!=c1)
            {
                return false;
            }
            map1[c1]=c2;
            map2[c2]=c1;
         }
        return true;
    }
}