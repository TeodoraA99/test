package initializationAndCleanup;

public class VarArgMethod {
    public static void printStrings(String... strings) {
        System.out.print("Received strings: ");
        for (String str : strings) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Pass a comma-separated list of Strings
        printStrings("Hello", "World", "Java");

        // Pass a String[]
        String[] stringArray = {"This", "is", "a", "test"};
        printStrings(stringArray);
    }
}

