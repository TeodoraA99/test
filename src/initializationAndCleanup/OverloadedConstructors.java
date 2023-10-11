package initializationAndCleanup;

public class OverloadedConstructors {
    int value;

    OverloadedConstructors(int value) {
        this(value, 0);
    }
    OverloadedConstructors(int value, int initialValue) {
        this.value = value + initialValue;
    }
    public int getValue() {
        return value;
    }
    public static void main(String[] args) {
        OverloadedConstructors obj1 = new OverloadedConstructors(5);
        System.out.println("Value of obj1: " + obj1.getValue());
        OverloadedConstructors obj2 = new OverloadedConstructors(10, 20);
        System.out.println("Value of obj1: " + obj2.getValue());
    }
}
