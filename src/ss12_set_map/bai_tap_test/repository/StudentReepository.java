package ss12_set_map.bai_tap_test.repository;

import ss12_set_map.bai_tap_test.model.Student;
import ss12_set_map.bai_tap_test.util.ReadWriteFile;

import java.util.ArrayList;
import java.util.List;

public class StudentReepository implements IStudentRepository{
    private final String STUDENT_FILE = "src/ss12_set_map/bai_tap_test/data/student.dat";
    @Override
    public List<Student> findAll() {
        List<Student> studentList = new ArrayList<>();
        studentList = ReadWriteFile.readBinaryFile(STUDENT_FILE);
        return studentList;
    }

    @Override
    public void add(Student student) {
        List<Student> studentList = ReadWriteFile.readBinaryFile(STUDENT_FILE);
        studentList.add(student);
        ReadWriteFile.writeBinaryFile(STUDENT_FILE,studentList);

    }

    @Override
    public Student searchId(int id) {
        List<Student> studentList = findAll();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == id){
                return studentList.get(i);
            }
        }
        return null;
    }

    @Override
    public boolean deleteById(int id) {
        List<Student> studentList = findAll();
        boolean check = false;
        for (int i = 0; i < studentList.size(); i++) {
            if (id == studentList.get(i).getId()){
                check = true;
                studentList.remove(i);
                break;
            }
        }
        if (check){
            ReadWriteFile.writeBinaryFile(STUDENT_FILE,studentList);

        }
        return check;
    }

    @Override
    public void updateStudent(Student student) {
        List<Student> studentList = findAll();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == student.getId()){
                studentList.set(i,student);
                break;
            }
        }
        ReadWriteFile.writeBinaryFile(STUDENT_FILE,studentList);
    }
}
