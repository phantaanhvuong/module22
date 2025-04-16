package demo_mvc.service;

import demo_mvc.entity.Student;
import demo_mvc.repository.IStudentRepository;
import demo_mvc.repository.StudentRepository;


public class StudentService implements IStudentService {
    private IStudentRepository studentRepository = new StudentRepository();

    @Override
    public Student[] findAll() {
        return studentRepository.findAll();
    }

    @Override
    public void add(Student student) {
        studentRepository.add(student);
    }
}
