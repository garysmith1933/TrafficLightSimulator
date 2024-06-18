package traffic;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to the traffic management system!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the number of roads:");
        while (true) {
            try {
                int roads = scanner.nextInt();
                if (roads > 0) {
                    break;
                }

                else {
                    System.out.println("Error! Incorrect Input. Try again: ");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error! Incorrect Input. Try again: ");
                scanner.nextLine();
            }

        }

        System.out.println("Input the Interval:");
        while (true) {
            try {
                int intervals = scanner.nextInt();
                if (intervals < 1) {
                    System.out.println("Error! Incorrect Input. Try again:");
                }

                else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error! Incorrect Input. Try again: ");
                scanner.nextLine();
            }
        }

        while (true) {
            try {
                System.out.println("Menu:");
                System.out.println("1. Add road");
                System.out.println("2. Delete road");
                System.out.println("3. Open system");
                System.out.println("0. Quit");

                int selection = scanner.nextInt();

                if (Objects.equals(selection, 0)) {
                    System.out.println("Bye!");
                    break;
                }

                switch (selection) {
                    case 1:
                        System.out.println("Road added");
                        clearConsole();
                        System.in.read();
                        break;

                    case 2:
                        System.out.println("Road deleted");
                        clearConsole();
                        System.in.read();
                        break;

                    case 3:
                        System.out.println("Open System");
                        clearConsole();
                        System.in.read();
                        break;

                    default:
                        System.out.println("Incorrect option");
                        clearConsole();
                        System.in.read();
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Incorrect option");
                scanner.nextLine();
                System.in.read();
            }
        }
    }


    private static void clearConsole() {
        try {
            var clearCommand = System.getProperty("os.name").contains("Windows")
                    ? new ProcessBuilder("cmd", "/c", "cls")
                    : new ProcessBuilder("clear");
            clearCommand.inheritIO().start().waitFor();
        }
        catch (IOException | InterruptedException ignored) {}
    }
}
