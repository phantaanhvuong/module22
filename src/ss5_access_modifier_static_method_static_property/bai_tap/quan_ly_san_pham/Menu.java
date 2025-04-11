package ss5_access_modifier_static_method_static_property.bai_tap.quan_ly_san_pham;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        showMenu();
    }
    public static void showMenu(){
        ProductManagement productManagement = new ProductManagement();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("--------Menu--------");
            System.out.println("1. Display");
            System.out.println("2. Create");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Search");
            System.out.println("6. Exit");
            System.out.println("Enter your choice");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:
                    productManagement.displayProduct();
                    break;
                case 2:
                    productManagement.createProduct();
                    break;
                case 3:
                    productManagement.updateProduct();
                    break;
                case 4:
                    productManagement.deleteProduct();
                    break;
                case 5:
                    productManagement.searchProduct();
                    break;
                case 6:
                    System.exit(6);
                    break;
            }
        }while(choice != 6);
    }
}
