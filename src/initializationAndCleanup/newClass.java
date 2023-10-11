package initializationAndCleanup;

public class newClass {
    public void method1() {
        System.out.println("Inside method 1");
        method2(); // Calling method2 without using this
        this.method2(); // Calling method2 using this
    }

    public void method2() {
        System.out.println("Inside method 2");
    }

    public static void main(String[] args) {
        newClass methods = new newClass();
        methods.method1();
    }
}

