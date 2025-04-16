package demo_mvc.repository;


import demo_mvc.entity.Student;

public interface IStudentRepository {
    Student[] findAll();
    void add(Student student);
    Student findById(int id);
    void update(int id, Student student);

}
