class Solution {
    public int smallestNumber(int n) {
        if(n == 1)
        {
            return 1;
        }
        for(int i =0;i<n;i++)
        {
            int x = (int)Math.pow(2,i);
            if(x-1>=n)
            {
                return x-1;
            }
        }
        return 1;
    }
}