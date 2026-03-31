package src;

    public class BitManipulation {
    public static String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();

        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i) - '0'; // Convert '0' or '1' to integer
                i--;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0'; // Convert '0' or '1' to integer
                j--;
            }

            carry = sum / 2; // 1 if sum is 2 or more, else 0
            result.append(sum % 2); // Append the current bit (0 or 1)
        }

        return result.reverse().toString(); // Reverse the result to get the correct order
    }

    public static void main(String[] args) {
        String a = "1010";
        String b = "1101";
        System.out.println("Sum: " + addBinary(a, b)); // Output: "10111"
    }
}

