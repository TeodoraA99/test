package initializationAndCleanup;

public class Dog2 {

    public void bark(int times, String sound) {
        for (int i = 0; i < times; i++) {
            System.out.println("The dog is barking " + sound + "!");
        }
    }
    public void bark(String sound, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("The dog is barking " + sound + "!");
        }
    }
    public void bark(boolean howl) {
        if (howl) {
            System.out.println("The dog is howling!");
        } else {
            System.out.println("The dog is barking!");
        }
    }
    public static void main(String[] args) {
        Dog2 myDog = new Dog2();
        myDog.bark(3, "loudly");
        myDog.bark("softly", 2);
        myDog.bark(true);
    }
}
