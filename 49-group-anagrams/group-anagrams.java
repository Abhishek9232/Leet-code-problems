class Solution {
    
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String,List<String>> map = new HashMap<>();
      for(String w:strs)

       {
        char [] arr = w.toCharArray();
        
        Arrays.sort(arr);
        String temp = new String(arr);
        if(!map.containsKey(temp))
        {
            map.put(temp,new ArrayList<>());
        }
        map.get(temp).add(w);
       }
       return new ArrayList<>(map.values());
        
    }
}