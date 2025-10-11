class Solution {
    public long maximumTotalDamage(int[] power) {
        Map<Integer, Long> map = new HashMap<>();
        for (int p : power) {
            map.put(p, map.getOrDefault(p, 0L) + p);
        }

        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list);

       
        int n = list.size();
        long[] dp = new long[n];
        dp[0] = map.get(list.get(0));

        for (int i = 1; i < n; i++) {
            long include = map.get(list.get(i));
            int j = i - 1;

            
            while (j >= 0 && list.get(j) >= list.get(i) - 2) {
                j--;
            }

            if (j >= 0) include += dp[j];

            long exclude = dp[i - 1]; 
            dp[i] = Math.max(include, exclude); 
        }

        return dp[n - 1];
    }
}