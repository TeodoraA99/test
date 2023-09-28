package operators;

public class AliasingDemo {
    public static void main(String[] args) {
        FloatContainer val1 = new FloatContainer();
        FloatContainer val2 = new FloatContainer();

        val1.value = 10.1f;
        val2.value = 35.2f;

        System.out.println("Value 1: " + val1.value);
        System.out.println("Value 2: " + val2.value);
        System.out.println();

        val1.value = val2.value;
        val2.value = 4.2f;
        System.out.println("Value 1: " + val1.value);
        System.out.println("Value 2: " + val2.value);
        System.out.println();

        val1 = val2;
        System.out.println("Value 1: " + val1.value);
        System.out.println("Value 2: " + val2.value);
        System.out.println();

        val1.value = 100f;
        System.out.println("Value 1: " + val1.value);
        System.out.println("Value 2: " + val2.value);
    }
}
