import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleCount = Integer.parseInt(scanner.nextLine());

        int[] currentState = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < currentState.length; i++) {
            if (currentState[i] < 4) {
                int freeSeats = 4 - currentState[i];

                if (peopleCount >= freeSeats) {
                    peopleCount = peopleCount - freeSeats;
                    currentState[i] = 4;
                } else {
                    currentState[i] = currentState[i] + peopleCount;
                    peopleCount = 0;
                }
            }
        }

        boolean isEmpty = false;
        for (int j : currentState) {
            if (j < 4) {
                isEmpty = true;
            }
        }

        if (peopleCount > 0) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", peopleCount);
        } else if (peopleCount == 0 && isEmpty) {
            System.out.println("The lift has empty spots!");
        }

        for (int i : currentState) {
            System.out.print(i + " ");
        }
    }
}


