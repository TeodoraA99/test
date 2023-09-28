package operators;

public class CharToBinary {
    public static void main(String[] args) {

        char[] characters = {'A', 'B', 'c', '1', '2', '3', '%', '$', '@'};

        System.out.println("Binary representation of characters:");
        for (char character : characters) {
            System.out.println(character + ": " + charToBinary(character));

        }
    }
    public static String charToBinary(char character){
        // Convert the char to an integer (Unicode code point) and then to binary
        return Integer.toBinaryString(character);
    }
}
