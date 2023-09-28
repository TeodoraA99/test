package everythingIsAnObject;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Storage {
    public static void main(String[] args) {
        String input = "Hello, World!";
        int result = storage(input);
        System.out.println("everythingIsAnObject.Storage size of " + input + " is: " + result);
    }

    // The storage() method calculates and returns the storage size of a string.
    public static int storage(String s) {
        return s.length() * 2;
    }
}
