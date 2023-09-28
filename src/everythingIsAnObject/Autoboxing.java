package everythingIsAnObject;

public class Autoboxing {
    public static void main(String[] args) {

        Integer intWrapper = 42;
        Double doubleWrapper = 3.14;
        Character charWrapper = 'A';
        Boolean boolWrapper = true;

        int intPrimitive = intWrapper;
        double doublePrimitive = doubleWrapper;
        char charPrimitive = charWrapper;
        boolean boolPrimitive = boolWrapper;

        System.out.println("everythingIsAnObject.Autoboxing and Unboxing:");
        System.out.println("Integer Wrapper: " + intWrapper + " intPrimitive: " + intPrimitive );
        System.out.println("Double Wrapper: " + doubleWrapper + " doublePrimitive: " + doublePrimitive);
        System.out.println("Character Wrapper: " + charWrapper + " charPrimitive: " + charPrimitive);
        System.out.println("Boolean Wrapper: " + boolWrapper + " boolPrimitive: " + boolPrimitive);
    }
}
