package initializationAndCleanup;

public class StringInitializationDemo {
    public String initializedADefinition = "Initialized at the point of definition";
    public String initializedByConstructor;

    public StringInitializationDemo(String value) {
        this.initializedByConstructor = value;
    }

    public String getInitializedADefinition() {
        return initializedADefinition;
    }

    public String getInitializedByConstructor() {
        return initializedByConstructor;
    }

    public static void main(String[] args) {
        StringInitializationDemo demo1 = new StringInitializationDemo("Initialized by constructor");

        System.out.println("initializedAtDefinition: " + demo1.getInitializedADefinition());
        System.out.println("initializedAtDefinition: " + demo1.getInitializedByConstructor());
    }
}
