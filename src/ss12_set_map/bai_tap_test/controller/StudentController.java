package ss12_set_map.bai_tap_test.controller;

import ss12_set_map.bai_tap_test.model.Student;
import ss12_set_map.bai_tap_test.service.StudentService;
import ss12_set_map.bai_tap_test.view.StudentView;

import java.util.List;
import java.util.Scanner;

public class StudentController {
    private static StudentService studentService = new StudentService();
    private static Scanner scanner = new Scanner(System.in);
    public static void menuStudent(){
        do {
            System.out.println("quản lý học sinh"+
                    "\n 1. hiển thị học sinh"+
                    "\n 2. thêm mới học sinh"+
                    "\n 3. xoá học sinh"+
                    "\n 4. chỉnh sửa học sinh"+
                    "\n 5. thoát chương trình"

            );
            System.out.println("chọn chức năng");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    List<Student> students = studentService.findAll();
                    StudentView.display(students);
                    break;

                case 2:
                    Student student = StudentView.addStudent();
                    studentService.add(student);
                    System.out.println("đã thêm thành công");
                    break;
                case 3:
                    System.out.println("nhập id cần xoá");
                    int deleteId = Integer.parseInt(scanner.nextLine());
                    boolean check = studentService.deleteId(deleteId);
                    if (check){
                        System.out.println("xoá thành công");
                    }else {
                        System.out.println("không tìm thấy id");
                    }
                    break;
                case 4:
                    Student studentEdit = studentService.searchId(StudentView.searchId());
                    if (studentEdit == null){
                        System.out.println("không tìm thấy");
                    }else {
                        StudentView.updateStudent(studentEdit);
                        studentService.updateStudent(studentEdit);
                    }
                    break;
                case 5:
                    return;
            }
        }while (true);
    }
}
