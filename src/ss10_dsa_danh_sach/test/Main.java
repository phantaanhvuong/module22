package ss10_dsa_danh_sach.test;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(12);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
//        Student student = new Student();
//        ArrayList<Student> students = new ArrayList<>();
//        students.add(student);
//        students.add(new Student());
//        for (int i = 0; i < students.size(); i++) {
//            System.out.println(students.get(i));
//        }
    }
}
