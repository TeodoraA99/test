package initializationAndCleanup;

public class StaticFieldInitialization {
    static String staticField1 = "Initialized at the point of definition";

    static String staticField2;

    static{
        staticField2 = "Initialized in a static block";
    }
    public static void printStaticFields(){
        System.out.println("staticField1: " + staticField1);
        System.out.println("staticField2: " + staticField2);
    }
    public static void main(String[] args) {
        // Call the static method to print the static fields
        printStaticFields();
    }
}
