package traffic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the traffic management system!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number of roads:");
        int roads = scanner.nextInt();

        System.out.println("Input the interval:");
        int intervals = scanner.nextInt();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add");
            System.out.println("2. Delete");
            System.out.println("3. System");
            System.out.println("0. Quit");

            int selection = scanner.nextInt();

            if (selection == 0) {
                System.out.println("Bye!");
                break;
            }

            switch (selection) {
                case 1:
                    System.out.println("Road added");
                    break;
                case 2:
                    System.out.println("Road deleted");
                    break;
                case 3:
                    System.out.println("Open System");
                    break;
            }
        }
    }
}