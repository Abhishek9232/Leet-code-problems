class Solution {
    public int firstoccurence(int nums[] , int target)
    {
        int s = 0;
        int e= nums.length-1;
         int indx = 0;
         while(s<=e)
         {
           int  mid =  (s+e)/2;
            if(nums[mid] == target)
            {
                indx = mid;
                e = mid-1;
            }
            if(target > nums[mid])
            {
                s= mid+1;

            }
            else
            e=mid-1;
         }
         return indx;

    }
     public int lastoccurence(int nums[] , int target)
    {
        int s = 0;
        int e= nums.length-1;
         int indx = 0;
         while(s<=e)
         {
           int  mid =  (s+e)/2;
            if(nums[mid] == target)
            {
                indx = mid;
                s = mid+1;
            }
            if(target < nums[mid])
            {
                e= mid-1;

            }
            else
            s=mid+1;
         }
         return indx;

    }

    public int[] searchRange(int[] nums, int target) {
        int low =0;
        int high = nums.length-1;
        int arr[] = new int[2];
        int indx1 =0;
        int indx2 = 0;

       
        while(low<=high)
        {
           int mid = (low + high)/2;
           if(nums[mid] == target)
           {
           
           int first = firstoccurence(nums , target);
           int last = lastoccurence(nums , target );
           arr[0] = first;
           arr[1] = last;
           return arr;
    
           }
           if(target > nums[mid])
           {
            low = mid +1;
           }
           else
           high = mid -1;
        }
        arr[0] = -1;
        arr[1] = -1;
        return arr;
    }
}