package operators;

public class AliasingDuringMethodCalls {
    static void f (FloatContainer x){
        x.value = 10.0f * 2;
    }
    public static void main(String[] args) {
        FloatContainer a = new FloatContainer();
        a.value = 2.0f;
        System.out.println(a.value);

        f(a);
        System.out.println(a.value);
    }
}
