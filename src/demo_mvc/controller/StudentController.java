package demo_mvc.controller;

import demo_mvc.entity.Student;
import demo_mvc.service.StudentService;
import demo_mvc.view.StudentView;

import java.util.Scanner;

public class StudentController {
    public static void displayMenu() {
        StudentService studentService = new StudentService();
        boolean flag = true;
        do {
            System.out.println("Chức năng của hệ thống " +
                    "\n 1.Display" +
                    "\n 2. Add" +
                    "\n 3.Delete" +
                    "\n 4. Edit" +
                    "\n 5. Search" +
                    "\n 6. Exit");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Chọn chức năng");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    // code display
                    System.out.println("chức năng hiện thị");
                    Student[] students = studentService.findAll();
                    StudentView.displayStudent(students);
                    break;
                case 2:
                    // code thêm mới
                    // gọi view nhập dữ liệu
                    Student student = StudentView.inputDatForStudent();
                    studentService.add(student);
                    break;
                case 3:
                    // code xóa
                    System.out.println("chức năng xóa");
                    break;
                case 4:
                    // code sửa
                    System.out.println("chức năng sửa");
                    break;
                case 5:
                    // code tìm kiếm
                    System.out.println("chức năng tìm kiếm");
                    break;
                default:
                    flag = false;
            }
        } while (flag);
    }


}
