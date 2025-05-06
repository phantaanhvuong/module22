package ss12_set_map.bai_tap_test.util;

import ss12_set_map.bai_tap_test.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {
    public static void writeBinaryFile(String filepath, List<Student> studentList){
        File file = new File(filepath);
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(studentList);
        } catch (FileNotFoundException e) {
            System.out.println("không tìm thấy file");
        } catch (IOException e) {
            System.out.println("lôi đọc file");
        }finally {
            try {
                objectOutputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                System.out.println("lỗi đóng file");
            }
        }
    }
    public static List<Student> readBinaryFile(String filepath){
        List<Student> studentList = new ArrayList<>();
        File file = new File(filepath);
        try{
            if (file.length()>0){
                FileInputStream fileInputStream = new FileInputStream(file);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                studentList =(List<Student>) objectInputStream.readObject();
            }
        } catch (FileNotFoundException e) {
            System.out.println("lỗi không tìm tấy file");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return studentList;
    }
}
