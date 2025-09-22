class Solution {
    public int longestOnes(int[] nums, int k) {
       
      int l=0;
      int r=0;
      int maxlen=0;
      int count=0;
      int n=nums.length;
      while(r<n)
      {
        if(nums[r]==0)
        {
            count++;
        }
        if(count>k)
        {
            if(nums[l]==0)
            { 
              count--;
             
            }
            l++;
           
        }
        if(count<=k)
        {
            int len =r-l+1;
            maxlen=Math.max(maxlen,len);
        }
        r++;
      }
      return maxlen;
    }
}