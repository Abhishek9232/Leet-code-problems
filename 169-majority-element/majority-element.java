class Solution {
    public int majorityElement(int[] nums) {
        int  i =0;
        Map<Integer,Integer> map = new HashMap<>();
        while(i<nums.length)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            i++;
        }
        int maxFreq = 0;
        int majority = -1;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                majority = entry.getKey();
            }
        }

        return majority;
    }
}