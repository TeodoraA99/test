package everythingIsAnObject;

public class NotInitializedVariables {
    private static int intValue;
    private static char charValue;

    public static void main(String[] args) {
        // Print the default values
        System.out.println("Default int value: " + intValue);
        System.out.println("Default char value: " + charValue);
        System.out.println();
    }
}