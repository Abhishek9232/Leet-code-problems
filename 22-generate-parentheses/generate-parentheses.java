class Solution {
    List<String> op = new ArrayList<>();
    public void solve(int open , int close , StringBuilder str)
    {
        if(open == 0 && close == 0)
        {
            op.add(str.toString());
            return;
        }
        if(open > 0)
        {
            str.append('(');
            solve(open -1 , close ,str);
            str.deleteCharAt(str.length()-1);
        }
        if(open < close)
        {
            str.append(')');
            solve(open ,close-1,str);
          str.deleteCharAt(str.length()-1);

        }
    }
    public List<String> generateParenthesis(int n) {
       int open = n;
       int close = n;
       solve(open,close, new StringBuilder());
       return op;
    }
}