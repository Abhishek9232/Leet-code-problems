class Solution {
    List<String> op = new ArrayList<>();
    public void backtrack(String s , StringBuilder str,int i)
    {
        if(i == s.length())
        {
            op.add(str.toString());
            return;
        }
       if(Character.isLetter(s.charAt(i)))
       {
        backtrack(s,str.append(Character.toLowerCase(s.charAt(i))),i+1);
        str.deleteCharAt(str.length() -1);
        backtrack(s,str.append(Character.toUpperCase(s.charAt(i))),i+1);
        str.deleteCharAt(str.length() -1);
       }
       else
       {
        backtrack(s,str.append(s.charAt(i)),i+1);
        str.deleteCharAt(str.length() -1);
       }

    }
    public List<String> letterCasePermutation(String s) {
       
      
        backtrack(s, new StringBuilder(),0);
        return op;

    }
}