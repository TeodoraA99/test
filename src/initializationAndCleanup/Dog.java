package initializationAndCleanup;

public class Dog {

    public void bark() {
        System.out.println("The dog is barking!");
    }

    public void bark(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Bark!");
        }
    }

    public void bark(double pitch) {
        System.out.println("Dog is barking with pitch " + pitch);
    }

    public void bark(boolean howl) {
        if (howl) {
            System.out.println("Dog is howling!");
        } else {
            System.out.println("Dog is barking!");
        }
    }

    public static void main(String[] args) {
        Dog mayDog = new Dog();

        mayDog.bark();
        mayDog.bark(3);
        mayDog.bark(2.5);
        mayDog.bark(true);
    }
}
