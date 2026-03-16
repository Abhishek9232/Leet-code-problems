class Solution {
    public boolean ispossible(int [] weights , int cap , int days)
    {

      int count =1;
      int sum = 0;
      for(int i = 0;i<weights.length;i++)
      {
        sum = sum + weights[i];
        if(sum > cap)
        {
          count++;
          sum = weights[i];
        }
      }
      if(count<=days)
      {
        return true;
      }
      else
       return false;
    }
    public int shipWithinDays(int[] weights, int days) {
         int low = Integer.MIN_VALUE;
         int n = weights.length;
         int high = 0;
         int ans=0;
         for(int i=0;i<n;i++)
         {
            if(low < weights[i])
            {
                low = weights[i];
            }
            high = high + weights[i];

         }
         while(low<=high)
         {
            int mid = low + (high -low)/2;
            if(ispossible(weights,mid,days))
            {
               ans = mid;
               high = mid - 1;  
            }
            else
            {
                low = mid + 1;
            }
         }
         return ans;
    }
}