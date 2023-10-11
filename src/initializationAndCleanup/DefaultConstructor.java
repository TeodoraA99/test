package initializationAndCleanup;

public class DefaultConstructor {

    public DefaultConstructor() {
        System.out.println("Hello from the default constructor!");
    }

    public DefaultConstructor(String message) {
        System.out.println("Hello from the overloaded constructor with message: " + message);
    }

    public static void main(String[] args) {
        DefaultConstructor print = new DefaultConstructor();

        DefaultConstructor print2 = new DefaultConstructor("Custom Message");
    }
}

