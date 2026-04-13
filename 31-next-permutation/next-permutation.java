class Solution 
{
    public void nextPermutation(int[] nums)
    {
        int n = nums.length;
        int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = n - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        int st = i +1;
        int ed = n-1;
        while (st < ed) {
            int temp = nums[st];
            nums[st] = nums[ed];
            nums[ed] = temp;
            st++;
            ed--;
        }
    }
}