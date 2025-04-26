package ss17_io_binary_file_va_seralization.bai_tap.crud_nhi_phan.controller;

import ss17_io_binary_file_va_seralization.bai_tap.crud_nhi_phan.entity.Student;
import ss17_io_binary_file_va_seralization.bai_tap.crud_nhi_phan.service.StudentService;
import ss17_io_binary_file_va_seralization.bai_tap.crud_nhi_phan.util.WriteReadFile;
import ss17_io_binary_file_va_seralization.bai_tap.crud_nhi_phan.view.StudentView;

import java.util.List;
import java.util.Scanner;

public class StudentController {
    private static StudentService studentService = new StudentService();
    public static void Menu(){


        boolean flag = true;
        do {
            System.out.println("quản lý sinh viên"+
                    "\n1. hiển thị sinh viên"+
                    "\n2. thêm mới sinh viên"+
                    "\n3. xoá sinh viên"+
                    "\n4. chỉnh sửa sinh viên"+
                    "\n5. thoát chương trình"

            );
            Scanner scanner = new Scanner(System.in);
            System.out.println("chọn chức năng");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    StudentView.display(studentService.findAll());
                    break;
                case 2:
                    studentService.add(StudentView.addStudent());
                    break;
                case 3:
                    System.out.println("nhap id can xoa");
                    int deleteId = Integer.parseInt(scanner.nextLine());
                    boolean check = studentService.deleteById(deleteId);
                    if (check){
                        System.out.println("xoa thanh cong");
                    }else {
                        System.out.println("khong tim thay id");
                    }
                    break;
                case 4:
                    Student studentEdit = studentService.findId(StudentView.searchId());
                    if (studentEdit == null){
                        System.out.println("khong co id");
                    }else {
                        StudentView.updateStudent(studentEdit);
                        studentService.updateById(studentEdit);
                        break;
                    }
                default:
                    flag = false;
            }
        }while (flag);
    }
}
