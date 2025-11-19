class Solution {
    public int findFinalValue(int[] nums, int original) {
        int i=0;
        Arrays.sort(nums);
        while(i< nums.length)
        {
            if(original == nums[i])
            {
                original = original * 2;
            }

            i++;
        }
        return original;
    }
}