package ss4_method.quan_ly_hoc_sinh;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        hienMenu();
    }


    public static void hienMenu() {
        StudentManagement studentManagement = new StudentManagement();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("==========[Menu]==========");
            System.out.println("1. Display");
            System.out.println("2. Add");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Seach");
            System.out.println("6. Exit");
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    studentManagement.displayStudent();
                    System.out.println("Nhấn Enter để quay lại");
                    scanner.nextLine();
                    break;
                case 2:
                    studentManagement.addStudent();
                    System.out.println("Nhấn Enter để quay lại");
                    scanner.nextLine();
                    break;
                case 3:
                    studentManagement.updateStudent();
                    System.out.println("Nhấn Enter để quay lại");
                    scanner.nextLine();
                    break;
                case 4:
                    studentManagement.deleteStudent();
                    System.out.println("Nhấn Enter để quay lại");
                    scanner.nextLine();
                    break;
                case 5:
                    studentManagement.seachStudent();
                    System.out.println("Nhấn Enter để quay lại");
                    scanner.nextLine();
                    break;
                case 6:
                    System.exit(6);
            }
        } while (choice != 6);
    }
}
