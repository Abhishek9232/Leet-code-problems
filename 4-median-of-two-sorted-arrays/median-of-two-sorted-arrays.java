import java.util.*;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLength = nums1.length + nums2.length;
        int[] merged = new int[totalLength];

        // Merge both arrays into one sorted array
        int i = 0, j = 0, k = 0;

        for (; i < nums1.length && j < nums2.length; ) {
            if (nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }

        // Copy remaining elements from nums1
        for (; i < nums1.length; ) {
            merged[k++] = nums1[i++];
        }

        // Copy remaining elements from nums2
        for (; j < nums2.length; ) {
            merged[k++] = nums2[j++];
        }

        // Now find the median
        if (totalLength % 2 == 1) {
            return merged[totalLength / 2];
        } else {
            int mid1 = merged[(totalLength / 2) - 1];
            int mid2 = merged[totalLength / 2];
            return (mid1 + mid2) / 2.0;
        }
    }
}
