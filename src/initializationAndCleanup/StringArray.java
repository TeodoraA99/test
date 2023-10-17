package initializationAndCleanup;

public class StringArray {
    public static void main(String[] args) {
        // Create an array of String objects
        String[] stringArray = new String[5];

        // Assign strings to each element
        stringArray[0] = "Hello";
        stringArray[1] = "World";
        stringArray[2] = "This";
        stringArray[3] = "is";
        stringArray[4] = "an array.";

        // Print the array using a for loop
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println("Element " + i + ": " + stringArray[i]);
        }
    }
}

