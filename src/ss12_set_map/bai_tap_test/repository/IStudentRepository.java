package ss12_set_map.bai_tap_test.repository;

import ss12_set_map.bai_tap_test.model.Student;

import java.util.List;
import java.util.Scanner;

public interface IStudentRepository {
    List <Student> findAll();
    void add (Student student);
    Student searchId(int id);
     boolean deleteById(int id);
     void updateStudent(Student student);

}
