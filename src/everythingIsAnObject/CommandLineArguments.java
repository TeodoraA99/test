package everythingIsAnObject;

public class CommandLineArguments {
    public static void main(String[] args) {
        // Check if there are at least three command-line arguments
        if (args.length < 3) {
            System.out.println("Please provide at least three command-line arguments.");
        } else {
            // Print the first three command-line arguments
            System.out.println("First Argument: " + args[0]);
            System.out.println("Second Argument: " + args[1]);
            System.out.println("Third Argument: " + args[2]);
        }
    }
}
