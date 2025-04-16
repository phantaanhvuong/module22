package demo_mvc.service;

import demo_mvc.entity.Student;

public interface IStudentService {
    Student[] findAll();
    void add(Student student);
}
