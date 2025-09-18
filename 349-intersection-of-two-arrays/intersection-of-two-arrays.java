class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
       
        for(int i =0;i<nums1.length;i++)
        {
            set1.add(nums1[i]);
        }
         for(int i =0;i<nums2.length;i++)
        {
            set2.add(nums2[i]);
        }
        set1.retainAll(set2);
        Integer[] array = set1.toArray(new Integer[0]);
         int arr[] = new int[set1.size()];
        for(int i =0;i<set1.size();i++)
        {
            arr[i] = array[i];
        }
        
        return arr;
    }
}