class Solution {
    public void reverseString(char[] s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s)
        {
            st.push(ch);
        }
        for(int i =0;i<s.length;i++)
        {
            s[i] = st.pop();
        }
        
        
    }
}