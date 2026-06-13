class Solution {
    public int missingNumber(int[] nums) {
        int temp = 0;
        int i =0;
        int j = nums.length;
        int count = 0;
        for(int k = 0;k<j;k++)
        {
            if(nums[k] != 0)
            {
                count++;
            }

        }
        if(count == j)
        {
            return 0;
        }
        while(i<j)
        {
            temp = temp + nums[i];
            i++;
        }
        int total = (j*(j+1))/2;
        if(total > temp)
        {
            return total - temp;
        }
         
         return total+1;
    }
}