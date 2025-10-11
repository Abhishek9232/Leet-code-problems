class Solution {
    public int longestSubstring(String s, int k) {
        int max = 0;

        for (int start = 0; start < s.length(); start++) {
            Map<Character, Integer> map = new HashMap<>();
            for (int end = start; end < s.length(); end++) {
                char c = s.charAt(end);
                map.put(c, map.getOrDefault(c, 0) + 1);

                boolean valid = true;
                for (int freq : map.values()) {
                    if (freq < k) {
                        valid = false;
                        break;
                    }
                }

                if (valid) {
                    max = Math.max(max, end - start + 1);
                }
            }
        }

        return max;
    }
}
