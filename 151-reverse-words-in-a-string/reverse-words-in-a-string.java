class Solution {
    public String reverseWords(String s) {
        String [] array = s.split(" +");
        StringBuilder  sb = new StringBuilder();
        for(int i = array.length-1;i>=0;i--)
        {
            sb.append(array[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}