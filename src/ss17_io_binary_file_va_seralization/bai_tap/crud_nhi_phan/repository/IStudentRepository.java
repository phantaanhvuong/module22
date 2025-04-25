package ss17_io_binary_file_va_seralization.bai_tap.crud_nhi_phan.repository;

import ss17_io_binary_file_va_seralization.bai_tap.crud_nhi_phan.entity.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> findAll();
    void add(Student student);
}
