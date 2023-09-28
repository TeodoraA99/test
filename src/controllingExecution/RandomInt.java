package controllingExecution;

import java.util.Random;

public class RandomInt {
    public static void main(String[] args) {

        Random random = new Random();

        int secondRandomValue = random.nextInt(100);
        System.out.println("Second Random Value: " + secondRandomValue);

        for (int i = 0; i < 25; i++) {
            int randomValue = random.nextInt(100); // Generating a random integer between 0 and 99
            System.out.println("Random Value " + (i + 1) + ": " + randomValue);
            if (randomValue > secondRandomValue) {
                System.out.println("   Greater than the second random value.");
            } else if (randomValue < secondRandomValue) {
                System.out.println("   Less than the second random value.");
            } else {
                System.out.println("   Equal to the second random value.");
            }
        }
    }
}