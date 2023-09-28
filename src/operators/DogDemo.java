package operators;

public class DogDemo {
    public static void main(String[] args) {

        Dog spot = new Dog("spot", "Ruff!");
        Dog scruffy = new Dog("scruffy", "Wurf!");

        Dog bendji = spot;

        System.out.println(spot.name + " says: " + spot.says);
        System.out.println(scruffy.name + " says: " + scruffy.says);
        System.out.println();

        System.out.println("Using == operator:");
        System.out.println("spot == bendji: " + (spot == bendji)); // true, they reference the same object
        System.out.println("spot == scruffy: " + (spot == scruffy)); // false, they reference different objects

        System.out.println("\nUsing equals() method:");
        System.out.println("spot.equals(bendji): " + spot.equals(bendji)); // true, they reference the same object
        System.out.println("spot.equals(scruffy): " + spot.equals(scruffy)); // false, they reference different objects
    }
}
