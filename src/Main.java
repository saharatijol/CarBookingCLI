import java.util.Scanner;

import static constants.Labels.*;


public class Main {

    public static void main(String[] args) {
        System.out.println(WELCOME);
        displayMenu();
    }

    private static void displayMenu() {
        System.out.println(DISPLAY_MENU);

        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        switch(option) {
            case 1 -> System.out.println(BOOK_CAR);

            case 2 -> System.out.println(ALL_BOOKED_CARS);

            case 3 -> System.out.println(ALL_BOOKINGS);

            case 4 -> System.out.println(ALL_AVAILABLE_CARS);

            case 5 -> System.out.println(ALL_AVAILABLE_ELEC);

            case 6 -> System.out.println(ALL_USERS);

            case 7 -> System.out.println(EXIT_MSG);

            default -> {
                System.out.println(INVALID_MSG);
                displayMenu();
            }
        }
    }
}
