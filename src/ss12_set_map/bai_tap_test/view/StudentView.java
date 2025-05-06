package ss12_set_map.bai_tap_test.view;

import ss12_set_map.bai_tap_test.model.Student;

import java.util.List;
import java.util.Scanner;

public class StudentView {
    private static Scanner scanner = new Scanner(System.in);
    public static void display(List<Student> students){
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }
    public static Student addStudent(){
        while (true){
            try {
                System.out.println("nhập id học sinh");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.println("nhập tên học sinh");
                String name = scanner.nextLine();
                System.out.println("nhập điểm trung bình");
                double dtb = Double.parseDouble(scanner.nextLine());
                System.out.println("nhập xếp loại học sinh");
                String xepLoai = scanner.nextLine();
                return new Student(id,name,dtb,xepLoai);
            }catch (NumberFormatException e){
                System.out.println("vui lòng nhập số");
            }
        }
    }
    public static int searchId(){
        System.out.println("nhập id cần sửa");
        return Integer.parseInt(scanner.nextLine());
    }
    public static void updateStudent(Student student){
        while (true){
            try {
                System.out.println("nhập tên học sinh");
                student.setName(scanner.nextLine());
                System.out.println("nhập điểm trung bình");
                student.setDtb(Double.parseDouble(scanner.nextLine()));
                System.out.println("nhập xếp loại học sinh");
                student.setXepLoai(scanner.nextLine());
                break;
            }catch (NumberFormatException e){
                System.out.println("vui lòng nhập số");
            }
        }
    }
}
