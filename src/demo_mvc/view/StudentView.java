package demo_mvc.view;



import demo_mvc.entity.Student;

import java.util.Scanner;

public class StudentView {
    private static Scanner scanner = new Scanner(System.in);
    public static void displayStudent(Student[] students){
        for (int i = 0; i <students.length ; i++) {
            if (students[i]!=null){
                System.out.println(students[i]);
            }else {
                break;
            }
        }
    }
    public static Student inputDatForStudent(){
        System.out.println("Chức năng thêm ới");
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập name: ");
        String name = scanner.nextLine();
        System.out.println("Nhập class Id: ");
        int classId = Integer.parseInt(scanner.nextLine());
        Student student = new Student(id, name, classId);
        return  student;
    }
}
