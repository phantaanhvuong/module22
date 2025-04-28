package casestudy.controller;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Menu" +
                    "\n 1. Employee Management" +
                    "\n 2. Customer Management" +
                    "\n 3. Facility Management " +
                    "\n 4. Booking Management" +
                    "\n 5. Promotion Management" +
                    "\n 6. Exit"
            );
            System.out.println("chọn chức năng");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Employee Management" +
                            "\n 1 Display list employees" +
                            "\n 2 Add new employee" +
                            "\n 3 Edit employee" +
                            "\n 4 tReturn main menu"

                    );
                    break;
                case 2:
                    System.out.println("Customer Management" +
                            "\n 1.\tDisplay list customers" +
                            "\n 2.\tAdd new customer" +
                            "\n 3.\tEdit customer" +
                            "\n 4.\tReturn main menu"
                    );
                    break;
                case 3:
                    System.out.println("Facility Management" +
                            "\n 1.\tDisplay list facility" +
                            "\n 2.\tAdd new facility" +
                            "\n 3\tDisplay list facility maintenance" +
                            "\n 4.\tReturn main menu"
                    );
                    break;
                case 4:
                    System.out.println("Booking Management" +
                            "\n1.\tAdd new booking" +
                            "\n2.\tDisplay list booking" +
                            "\n3.\tCreate new contracts" +
                            "\n4.\tDisplay list contract" +
                            "\n5.\tEdit contracts" +
                            "\n6.\tReturn main menu"

                    );
                    break;
                case 5:
                    System.out.println("Promotion Management" +
                            "\n1.\tDisplay list customers use service" +
                            "\n2.\tDisplay list customers get voucher" +
                            "\n3.\tReturn main menu"
                    );
                    break;
                default:
                    flag = false;
            }

        }while (flag);
    }
}
