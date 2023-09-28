package operators;

import java.util.Random;

public class CoinFlipping {
    public static void main(String[] args) {
        // Create a Random object for generating random numbers
        Random random = new Random();

        //generates a random boolean value (true or false).
        boolean isHeads = random.nextBoolean();

        if (isHeads) {
            System.out.println("The coin landed on heads!");
        } else {
            System.out.println("The coin landed on tails!");
        }
    }
}
