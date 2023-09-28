package operators;

public class HexOctalWithLong {
    public static void main(String[] args) {
        // Decimal long value
        long decimalValue = 123456789L;

        // Convert to hexadecimal (hex) notation
        String hexValue = Long.toHexString(decimalValue);
        System.out.println("Hexadecimal (Hex) Notation: 0x" + hexValue);
        System.out.println("Binary Representation: " + Long.toBinaryString(decimalValue));

        // Convert to octal notation
        String octalValue = Long.toOctalString(decimalValue);
        System.out.println("Octal Notation: 0" + octalValue);
        System.out.println("Binary Representation: " + Long.toBinaryString(decimalValue));
    }
}
