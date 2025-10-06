import java.math.BigInteger;

class Solution {

    // Convert decimal (BigInteger) to binary string
    public static String convertToBinary(BigInteger decimal) {
        if (decimal.equals(BigInteger.ZERO)) {
            return "0";
        }
        StringBuilder binary = new StringBuilder();
        while (decimal.compareTo(BigInteger.ZERO) > 0) {
            binary.append(decimal.mod(BigInteger.TWO));   // remainder 0 or 1
            decimal = decimal.divide(BigInteger.TWO);     // divide by 2
        }
        return binary.reverse().toString();
    }

    public String addBinary(String a, String b) {
        // Convert binary strings to decimal using BigInteger
        BigInteger dec1 = BigInteger.ZERO;
        BigInteger dec2 = BigInteger.ZERO;
        BigInteger pow2 = BigInteger.ONE; // starts with 2^0

        // convert binary 'a' to decimal (from right to left)
        for (int i = a.length() - 1; i >= 0; i--) {
            if (a.charAt(i) == '1') {
                dec1 = dec1.add(pow2);
            }
            pow2 = pow2.multiply(BigInteger.TWO);
        }

        // reset pow2 and convert 'b'
        pow2 = BigInteger.ONE;
        for (int i = b.length() - 1; i >= 0; i--) {
            if (b.charAt(i) == '1') {
                dec2 = dec2.add(pow2);
            }
            pow2 = pow2.multiply(BigInteger.TWO);
        }

        // Add both decimal numbers
        BigInteger sum = dec1.add(dec2);

        // Convert back to binary
        return convertToBinary(sum);
    }
}
