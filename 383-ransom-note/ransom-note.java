class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (magazine.length() < ransomNote.length()) 
        return false; 

        HashMap<Character, Integer> map = new HashMap<>();

    
        for (char c : magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        
        for (char c : ransomNote.toCharArray()) {
            int available = map.getOrDefault(c, 0);
            if (available == 0) 
            return false;
            map.put(c, available - 1);
        }

        return true; 
        
    }
}