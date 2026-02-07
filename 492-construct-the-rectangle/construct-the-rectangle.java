class Solution {
    public int[] constructRectangle(int area) {
        int diff = Integer.MAX_VALUE;
        int L = 0, W = 0;

        for (int i = 1; i * i <= area; i++) {
            if (area % i == 0) {
                int length = area / i;
                int width = i;

                if (length - width < diff) {
                    diff = length - width;
                    L = length;
                    W = width;
                }
            }
        }
        return new int[]{L, W};
    }
}
