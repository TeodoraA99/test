package everythingIsAnObject;

public class StaticTest {
    static int i = 47;

    public static void main(String[] args) {
        System.out.println("Before increment: everythingIsAnObject.StaticTest.i = " + StaticTest.i);
        Incrementable.increment();
        System.out.println("After increment: everythingIsAnObject.StaticTest.i = " + StaticTest.i);
    }
}
