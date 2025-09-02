class Solution {
    public int commonFactors(int a, int b) {
        
        int x = a, y = b;
        while (y != 0) {
            int temp = x % y;
            x = y;
            y = temp;
        }
        int gcd = x; 
        int count = 0;
        for (int i = 1; i * i <= gcd; i++) {
            if (gcd % i == 0) {
                count++; 
                if (i != gcd / i) {
                    count++; 
                }
            }
        }
        return count;
    }
}
