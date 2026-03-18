class Solution {
    List<List<Integer>> op = new ArrayList<>();
    public void solve(int i , int [] nums , List<Integer> res)
    {
        if(i == nums.length)
        {
            op.add(new ArrayList<>(res));
            return;
        }
        res.add(nums[i]);
        solve(i+1,nums,res);
        res.remove(res.size() - 1);
        while(i+1<nums.length && nums[i] == nums[i+1])
        {
           
         i++;  
        }
        solve(i+1,nums,res);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> res = new ArrayList<>();
        solve(0,nums,res);
        return op;
    }
}