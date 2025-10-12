class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
     Map<Integer,Integer> map = new HashMap<>();
     int i=0;
     int sum=0;
     while(i<nums.length)
     {
        map.put(nums[i] ,map.getOrDefault(nums[i],0)+1);
        i++;
     }
     for(int key : map.keySet())
     {
        int freq= map.get(key);
        if(freq % k == 0)
        {
            sum = sum + key * freq;
        }
     }
     return sum;
    }
}