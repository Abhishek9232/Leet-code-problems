class Solution {
    public int longestValidParentheses(String s) {
        if(s.length() == 0)
        {
            return 0;
        }
        Stack<Integer> st = new Stack<>();
        int n = s.length();
        int i = 0;
        st.push(-1);
        int max= 0;

        while(i<n)
        {
            if(s.charAt(i) == '(')
            {
                st.push(i);
                
            }
            else
            {
                st.pop();
            }
            if(st.isEmpty())
            {
              st.push(i);
            }
            else
            {
                int len = i - st.peek();
                max = Math.max(max,len);
            }
            i++;
        }
        return max;
    }
}