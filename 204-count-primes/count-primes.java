class Solution {
    public int countPrimes(int n) {
        
       
        // code here
        int count=0;
        boolean [] isprime = new boolean[n+1];
        Arrays.fill(isprime,true);
        isprime[0] = false;
       
        for(int i=2;i*i<=n;i++)
        {
            if(isprime[i] == true)
            {
                for(int j = i*i; j<= n;j+=i)
                {
                    isprime[j]= false;
                }
            }
        }
        for(int i =2 ;i<n;i++)
        {
            if(isprime[i] == true)
            {
                count = count+1;
            }
        }
        return count;
    }
}
   