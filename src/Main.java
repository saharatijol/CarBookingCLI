import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nWelcome to CLI Car Booking System");
        System.out.println();

        displayMenu();
    }

    private static void displayMenu() {
        System.out.println("Select options below: ");
        System.out.println("1️⃣ - Book Car");
        System.out.println("2️⃣ - View All User Booked Cars");
        System.out.println("3️⃣ - View All Bookings");
        System.out.println("4️⃣ - View Available Cars");
        System.out.println("5️⃣ - View Available Electric Cars");
        System.out.println("6️⃣ - View all users");
        System.out.println("7️⃣ - Exit");

        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to do? Please press 7 to exit: ");
        int option = scanner.nextInt();

        switch(option) {
            case 1 -> System.out.println("You've chosen to book a car");

            case 2 -> System.out.println("Viewing all booked cars");

            case 3 -> System.out.println("Viewing all bookings");

            case 4 -> System.out.println("Viewing all available cars");

            case 5 -> System.out.println("Viewing all available electric cars");

            case 6 -> System.out.println("Viewing all users");

            case 7 -> {
                System.out.println("You've chosen to exit the Car Booking System.");
                System.out.println("Thank you. Good bye!");
            }
            
            default -> {
                System.out.println("You chose an invalid option. Try again");
                displayMenu();
                throw new IllegalStateException("Invalid option: " + option);
            }
        }
    }
}