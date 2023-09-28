package operators;

public class LeftShift {
    public static void main(String[] args) {

        int number = 0xFFFFFFFF; // Hexadecimal constant with all bits set to 1

        System.out.println("Original Number (in binary): " + Integer.toBinaryString(number));

        // Left shift the number
        number = number << 1;

        // Display the result after left shift
        System.out.println("After left shift (in binary): " + Integer.toBinaryString(number));

        // Right shift through all binary positions using unsigned right shift (>>>)
        for (int i = 0; i < 32; i++) {
            number = number >>> 1; // Unsigned right shift by 1 position

            // Display the result at each step
            System.out.println("After unsigned right shift " + (i + 1) + " (in binary): " + Integer.toBinaryString(number));
        }
    }
}






