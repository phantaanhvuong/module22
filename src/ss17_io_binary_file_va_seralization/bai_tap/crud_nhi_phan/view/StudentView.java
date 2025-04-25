package ss17_io_binary_file_va_seralization.bai_tap.crud_nhi_phan.view;

import ss17_io_binary_file_va_seralization.bai_tap.crud_nhi_phan.entity.Student;

import java.util.List;
import java.util.Scanner;

public class StudentView {
    private static Scanner scanner = new Scanner(System.in);
    public static void display(List<Student> students){
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }
    public static Student addStudent (){
        while (true){
            try {
                System.out.println("nhập id học sinh");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.println("nhập tên học sinh");
                String name = scanner.nextLine();
                System.out.println("nhập tuổi học sinh");
                int age = Integer.parseInt(scanner.nextLine());
                return new Student(id,name,age);
            }catch (NumberFormatException e){
                System.out.println("vui lòng nhập số");
            }
        }
    }
}
