package ss12_set_map.bai_tap_test.service;

import ss12_set_map.bai_tap_test.model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();
    void add(Student student);
    Student searchId(int id);
    boolean deleteId(int id);
    void updateStudent(Student student);
}
