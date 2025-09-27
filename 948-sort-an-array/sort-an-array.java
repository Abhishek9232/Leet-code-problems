class Solution {
    public static void quicksort(int nums[] , int low , int high)
    {
        if(low < high)
        {
            int pivot = partition(nums , low , high);
            quicksort(nums , low , pivot - 1);
            quicksort(nums , pivot + 1 , high);
        }
    }

    public static int partition(int nums[] , int low , int high)
    {
        // \U0001f511 Random pivot
        int randIndex = low + (int)(Math.random() * (high - low + 1));
        int tempSwap = nums[low];
        nums[low] = nums[randIndex];
        nums[randIndex] = tempSwap;

        int x = nums[low];
        int i = low;
        int j = high;

        while(i < j)
        {
            while(i <= high && nums[i] <= x)
                i++;
            while(j >= low && nums[j] > x)
                j--;
            if(i < j)
            {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        int temp = nums[low];
        nums[low] = nums[j];
        nums[j] = temp;

        return j;
    }

    public int[] sortArray(int[] nums) {
        quicksort(nums , 0, nums.length - 1);
        return nums;
    }
}
