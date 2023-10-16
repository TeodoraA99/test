import java.util.Arrays;
import java.util.Scanner;

public class Ladybugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] field = new int[n];

        int[] bugIndexes = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < bugIndexes.length; i++) {
            int currentBugIndex = bugIndexes[i];          // Взима номера на индекса от масива bugIndexes[i]
                                                          // и на същия индекс в масива field[currentBugIndex] чрез цикъла записва 1ца на т.е. има калинка
            if (currentBugIndex >= 0 && currentBugIndex < field.length) {
                field[currentBugIndex] = 1;
            }
        }

        String command = scanner.nextLine();
        while (!"end".equals(command)) {
            String[] commands = command.split(" ");
            int currentPosition = Integer.parseInt(commands[0]);
            String direction = commands[1];
            int length = Integer.parseInt(commands[2]);

            if (currentPosition < 0 || currentPosition >= field.length || field[currentPosition] == 0) {
                command = scanner.nextLine();                             // проверка дали на индекса има калинка, която да трябва да се премести, (по условие е казано, че може да се подаде такъв вход)
                continue;                                                 //ако няма скипваме командата и прочитаме следващата
            }

            field[currentPosition] = 0;

            if ("right".equals(direction)) {
                currentPosition += length;

                while (currentPosition < field.length && currentPosition >= 0) {
                    if (field[currentPosition] == 0) {
                        field[currentPosition] = 1;
                        break;
                    } else if (field[currentPosition] == 1) {
                        currentPosition += length;
                        //тук не слагаме break, защото ще влезе в проверката само 1 път ако позицията е =1 и
                        //ще увеличи currentPosition само веднъж, а може да трябва да се увеличи няколко пъти
                        // в зависимост от това дали на позицията докато е вътре в полето има калинка,
                        // затова е и while - цикъла, да следи дали при увеличаване на currentPosition,
                        // тя остава в полето, същото е и за случая с left
                    }
                }
            } else if ("left".equals(direction)) {
                currentPosition -= length;
                while (currentPosition >= 0 && currentPosition < field.length) {
                    if (field[currentPosition] == 0) {
                        field[currentPosition] = 1;
                        break;
                    } else if (field[currentPosition] == 1) {
                        currentPosition -= length;

                    }
                }
            }
            command = scanner.nextLine();
        }
        for (int j : field) {
            System.out.print(j + " ");
        }
    }
}
