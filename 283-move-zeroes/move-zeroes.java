class Solution {
    public void moveZeroes(int[] nums) {
        int l=nums.length;
        if(nums.length==1)
        {
            return;
        }
        int nz=0;
        for(int i =0;i<l;i++)
        {
            if(nums[i]!=0)
            {
                nums[nz]=nums[i];
                nz++;
            }
        }
        while(nz<l)
        {
          nums[nz]=0;
          nz++;  
        }
        
         
    }
}