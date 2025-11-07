class Solution {
    public String frequencySort(String s) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch:s.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

         PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
         pq.addAll(map.entrySet());
        String res="";
          while (!pq.isEmpty()) {
            Map.Entry<Character, Integer> entry = pq.poll();
            for(int i=0;i<entry.getValue();i++)
            {
                res=entry.getKey()+res;
            }
            
        }

        return res;
    }
}