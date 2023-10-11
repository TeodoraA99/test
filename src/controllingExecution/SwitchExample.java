package controllingExecution;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <= n; i++) {
            switch (i) {
                case 1:
                    System.out.println("Case 1: i is 1");
                    break;
                case 50:
                    System.out.println("Case 50: i is 50");
                    break;
                case 25:
                    System.out.println("Case 25: i is 25");
                    break;
                case 100:
                    System.out.println("Case 100: i is 100");
                    break;
            }
        }
    }
}
