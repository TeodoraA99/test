package initializationAndCleanup;

public class UninitializedString {
    public String uninitializedString;

    public String getUninitialized() {
        return uninitializedString;
    }

    public static void main(String[] args) {
        UninitializedString demo = new UninitializedString();
        String value = demo.getUninitialized();
        System.out.println(value);
    }
}