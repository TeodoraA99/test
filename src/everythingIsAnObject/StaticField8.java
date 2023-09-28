package everythingIsAnObject;

public class StaticField8 {
     static int staticField = 0;

    public static void main(String[] args) {
        StaticField8 instance1 = new StaticField8();
        StaticField8 instance2 = new StaticField8();
        StaticField8 instance3 = new StaticField8();

        staticField = 1;
        staticField = 2;
        staticField = 3;

        System.out.println("Instance 1: staticField = " + staticField);
        System.out.println("Instance 2: staticField = " + staticField);
        System.out.println("Instance 3: staticField = " + staticField);

        System.out.println("everythingIsAnObject.StaticField8.staticField = " + StaticField8.staticField);
    }
}

