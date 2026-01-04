class Solution {
    public int findLHS(int[] nums) {
      Arrays.sort(nums);
      int left = 0;
      int right =0;
      int len =0;
      while (right < nums.length)
       {

    if (nums[right] - nums[left] > 1) 
    {
        left++;   
    } 
    else 
    {
   
        if (nums[right] - nums[left] == 1) 
        {
            len = Math.max(len, right - left + 1);
        }
        right++; 
    }
}
return len;
 
    }
}