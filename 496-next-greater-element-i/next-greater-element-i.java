class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) 
    {
        int n = nums2.length;
        int[] next = new int[n]; 
        Arrays.fill(next, -1);   

        Stack<Integer> st = new Stack<>(); 
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && nums2[i] > nums2[st.peek()]) {
                int idx = st.pop();
                next[idx] = nums2[i];
            }
            st.push(i);
        }
        int[] result = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
           
            for (int j = 0; j < n; j++) {
                if (nums1[i] == nums2[j]) {
                    result[i] = next[j]; 
                    break;
                }
            }
        }

        return result;
        
    }
}