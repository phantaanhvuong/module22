package ss17_io_binary_file_va_seralization.bai_tap.crud_nhi_phan.repository;

import ss17_io_binary_file_va_seralization.bai_tap.crud_nhi_phan.entity.Student;
import ss17_io_binary_file_va_seralization.bai_tap.crud_nhi_phan.util.WriteReadFile;

import java.util.ArrayList;
import java.util.List;

public class StudentRepsitory implements IStudentRepository {
    private final String STUDENT_DAT_FILE = "src/ss17_io_binary_file_va_seralization/bai_tap/crud_nhi_phan/data/student.dat";

    @Override
    public List<Student> findAll() {
        List<Student> studentList = new ArrayList<>();
        studentList = WriteReadFile.readBinaryFile(STUDENT_DAT_FILE);
        return studentList;
    }

    @Override
    public void add(Student student) {
        List<Student> studentList = WriteReadFile.readBinaryFile(STUDENT_DAT_FILE);
        studentList.add(student);
        WriteReadFile.wirteBinaryFile(STUDENT_DAT_FILE,studentList);
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
            WriteReadFile.wirteBinaryFile(STUDENT_DAT_FILE,studentList);
        }
        return check;

    }

    @Override
    public void updateByid(Student student) {
        List<Student> studentList = findAll();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == student.getId()){
                studentList.set(i,student);
            }
            break;
        }
        WriteReadFile.wirteBinaryFile(STUDENT_DAT_FILE,studentList);
    }

    @Override
    public Student findId(int id) {
        List<Student> studentList = findAll();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == id){
                return studentList.get(i);
            }
        }
        return null;
    }
}
