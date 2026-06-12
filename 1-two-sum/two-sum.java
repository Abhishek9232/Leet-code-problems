class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] arr = new int[2];
        int i =0;
        int j = 1;
        while(i < nums.length)
        {
            int temp = target - nums[i];
            while(j < nums.length)
            {
                if(temp == nums[j] && i != j)
                {
                    arr[0] = i;
                    arr[1] = j;

                }
                j++;
            }
            j = i+1;
            i++;
        }
        return arr;
    }
}