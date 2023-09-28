package everythingIsAnObject;

public class DataOnly {
    int i;
    double d;
    boolean b;
    static DataOnlySecond data = new DataOnlySecond();
    static DataOnlySecond data2 = new DataOnlySecond();


    public static void main(String[] args) {
        data.i = 47;
        data.d = 1.1;
        data.b = false;

        System.out.println(data.i);
        System.out.println(data.d);
        System.out.println(data.b);

        System.out.println(data.getSum());

        System.out.println(data2.getSum());
    }
}
