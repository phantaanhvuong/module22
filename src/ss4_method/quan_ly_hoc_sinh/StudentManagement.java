package ss4_method.quan_ly_hoc_sinh;

import java.util.Locale;
import java.util.Scanner;

public class StudentManagement {
    Scanner scanner = new Scanner(System.in);
    public static Student[] students = new Student[100];

    static {
        students[0] = new Student(1, "Vuong");
        students[1] = new Student(2, "Ly");
        students[2] = new Student(3, "Huy");
    }

    public void displayStudent() {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println(students[i].toString());
            }
        }
    }

    public void addStudent() {
        System.out.println("nhập id ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập name ");
        String name = scanner.nextLine();
        Student student = new Student(id, name);
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }

    }

    public void updateStudent() {
        System.out.println("nhập id bạn muốn sữa");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < students.length; i++) {
            if (id == students[i].getId()) {
                System.out.println("nhập id mới");
                int newId = Integer.parseInt(scanner.nextLine());
                System.out.println("nhâp name mới");
                String newName = scanner.nextLine();
                students[i].setId(newId);
                students[i].setName(newName);
                return;
            } else {
                System.out.println("id này không nằm trong danh sách");
                break;
            }
        }
    }

    public void deleteStudent() {
        System.out.println("nhập id bạn muốn xoá");
        int id = Integer.parseInt(scanner.nextLine());
        int index = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getId() == id) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("id bạn tìm không nằm trong danh sách");
        } else {
            for (int i = index; i < students.length - 1; i++) {
                students[i] = students[i + 1];
            }
        }
    }

    public void seachStudent() {
        System.out.println("nhập tên cần tìm");
        String name = scanner.nextLine().toLowerCase();
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            if (student.getName().toLowerCase().contains(name)){
                System.out.println(student);
                break;
            }
        }
    }

}


