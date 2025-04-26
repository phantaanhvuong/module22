package ss17_io_binary_file_va_seralization.bai_tap.crud_nhi_phan.service;

import ss12_set_map.bai_tap.repository.IProductRepository;
import ss17_io_binary_file_va_seralization.bai_tap.crud_nhi_phan.entity.Student;
import ss17_io_binary_file_va_seralization.bai_tap.crud_nhi_phan.repository.IStudentRepository;
import ss17_io_binary_file_va_seralization.bai_tap.crud_nhi_phan.repository.StudentRepsitory;

import java.util.List;

public class StudentService implements IStrudentService{
    IStudentRepository studentRepository = new StudentRepsitory();
    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public void add(Student student) {
        studentRepository.add(student);
    }

    @Override
    public boolean deleteById(int id) {
        return studentRepository.deleteById(id);
    }

    @Override
    public void updateById(Student student) {
        studentRepository.updateByid(student);
    }

    @Override
    public Student findId(int id) {
        return studentRepository.findId(id);
    }
}
