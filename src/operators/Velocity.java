package operators;

public class Velocity {
    public static void main(String[] args) {

        double distance = 1000;
        double time = 80;

        double velocity = calculateVelocity(distance, time);
        System.out.println("Velocity: " + velocity + " m/s");
    }
    public static double calculateVelocity(double distance, double time) {
        return distance / time;
    }
}