class Solution {
    List<List<Integer>> op = new ArrayList<>();
    public void backtrack(int [] nums , List<Integer> res)
    {
        if(res.size() == nums.length)
        {
            op.add(new ArrayList<>(res));
            return ;
        }
        for(int i : nums)
        {
          if(res.contains(i))
        {
            continue;
        }
        res.add(i);
        backtrack(nums,res);
        res.remove(res.size()-1);
        }
        
    }
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> res = new ArrayList<>();
        backtrack(nums,res);
        return op;
    }
}