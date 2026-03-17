class Solution {
    List<List<Integer>> op = new ArrayList<>();
    public void backtrack(int i ,int [] arr,List<Integer> res)
    {
        
        
            op.add(new ArrayList<>(res));
            
        
        for(int j = i;j<arr.length;j++)
        {
            if(j>i && arr[j] == arr[j -1])
            {
                continue;
            }
            res.add(arr[j]);
        backtrack(j+1,arr,res);
        res.remove(res.size() - 1);
        
        }
        
        
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> res = new ArrayList<>();
        backtrack(0,nums,res);
        return op;
    }
}