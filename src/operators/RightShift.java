package operators;

public class RightShift {
    public static void main(String[] args) {
        // Start with a number that has a binary one in the most significant position
        int number = 0x80000000; // Hexadecimal constant with the leftmost bit set to 1

        // Display the original binary representation
        System.out.println("Original Number (in binary): " + Integer.toBinaryString(number));

        // Right shift through all binary positions
        for (int i = 0; i < 32; i++) {
            number = number >> 1; // Right shift by 1 position

            // Display the result at each step
            System.out.println("After right shift " + (i + 1) + " (in binary): " + Integer.toBinaryString(number));
        }
    }
}

