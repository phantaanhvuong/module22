package ss17_io_binary_file_va_seralization.bai_tap.crud_nhi_phan.service;

import ss17_io_binary_file_va_seralization.bai_tap.crud_nhi_phan.entity.Student;

import java.util.List;

public interface IStrudentService {
    List<Student> findAll();
    void add(Student student);
    boolean deleteById(int id);
    void updateById (Student student);
    Student findId(int id);
}
