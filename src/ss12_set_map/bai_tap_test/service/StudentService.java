package ss12_set_map.bai_tap_test.service;

import ss12_set_map.bai_tap_test.model.Student;
import ss12_set_map.bai_tap_test.repository.IStudentRepository;
import ss12_set_map.bai_tap_test.repository.StudentReepository;

import java.util.List;

public class StudentService implements IStudentService{
    private IStudentRepository studentRepository = new StudentReepository();

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public void add(Student student) {
        studentRepository.add(student);
    }

    @Override
    public Student searchId(int id) {
        return studentRepository.searchId(id);
    }

    @Override
    public boolean deleteId(int id) {
        return studentRepository.deleteById(id);
    }

    @Override
    public void updateStudent(Student student) {
        studentRepository.updateStudent(student);
    }
}
