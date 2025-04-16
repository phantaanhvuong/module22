package demo_mvc.controller;



import java.util.Scanner;

public class CodeGymController {
    public static void displayMenu(){
        boolean flag =true;
        do {
            System.out.println("Quản lý hệ thống " +
                    "\n 1.Quản lý sinh viên" +
                    "\n 2. Quản lý giáo viên" +
                    "\n 3.Quản lý nhân sự " +
                    "\n 4. Exit");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Chọn chức năng");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                     StudentController.displayMenu();
                    break;
                case 2:
                    System.out.println("quản lý giáo viên");
                    break;
                case 3:

                    break;
                default:
                    flag=false;
            }
        }while (flag);
    }
}
