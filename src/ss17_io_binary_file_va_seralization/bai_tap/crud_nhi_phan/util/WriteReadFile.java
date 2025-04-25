package ss17_io_binary_file_va_seralization.bai_tap.crud_nhi_phan.util;

import ss17_io_binary_file_va_seralization.bai_tap.crud_nhi_phan.entity.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteReadFile {
    public static void  wirteBinaryFile(String filePath, List<Student> studentList){
        File file = new File(filePath);
        try (FileOutputStream fileOutputStream = new FileOutputStream(file);
             ObjectOutputStream objectOutputStream  = new ObjectOutputStream(fileOutputStream)){
            objectOutputStream.writeObject(studentList);

        } catch (FileNotFoundException e) {
            System.out.println("không tìm thấy file");
        } catch (IOException e) {
            System.out.println("lỗi ghi file");
        }
    }
    public static List<Student> readBinaryFile(String filePath){
        List<Student> studentList = new ArrayList<>();
        File file = new File(filePath);
        try {
            if (file.length()>0){
                FileInputStream fileInputStream = new FileInputStream(file);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                studentList = (List<Student>) objectInputStream.readObject();
            }
        } catch (FileNotFoundException e) {
            System.out.println("lỗi không tìm thấy file");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return studentList;
    }
}
