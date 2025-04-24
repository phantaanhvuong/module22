package ss12_set_map.bai_tap.util;

import org.w3c.dom.DOMStringList;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

//public class ReadAndWriteFile {
//    public static void writeFile(String filePath,List<String> stringList, boolean append){
//        File file = new File(filePath);
//        FileWriter fileWriter = null;
//        BufferedWriter bufferedWriter = null;
//        try {
//            fileWriter = new FileWriter(file, append);
//            bufferedWriter = new BufferedWriter(fileWriter);
//            for (String line : stringList){
//                bufferedWriter.write(line);
//                bufferedWriter.newLine();
//            }
//
//        } catch (IOException e) {
//            System.out.println("loi ghi file");
//        }finally {
//            try {
//                bufferedWriter.close();
//                fileWriter.close();
//            } catch (IOException e) {
//                System.out.println(" loi dong file");
//            }
//        }
//    }
//    public static  List<String> readFile(String filePath){
//        List<String> stringList = new ArrayList<>();
//        File file = new File(filePath);
//        FileReader fileReader = null;
//        BufferedReader bufferedReader = null;
//        try {
//            fileReader = new FileReader(file);
//            bufferedReader = new BufferedReader(fileReader);
//            String line = "";
//            while ((line = bufferedReader.readLine()) != null){
//                stringList.add(line);
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println("loi khong tim thay file");
//        } catch (IOException e) {
//            System.out.println("loi doc file");
//        }finally {
//            try {
//                bufferedReader.close();
//                fileReader.close();
//            } catch (IOException e) {
//                System.out.println("loi dong file");
//            }
//        }
//
//        return stringList;
//    }
//}
public class ReadAndWriteFile {
    // phương thức ghi
    public static void writeFile(String pathFile, List<String> stringList, boolean append){
        File file = new File(pathFile);
        try(FileWriter fileWriter = new FileWriter(file, append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            for (String line: stringList) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("lôi đọc file");
        }
    }
    // phương thưc đọc
    public static List<String> readFile(String pathFile){
        List<String> stringList = new ArrayList<>();
        File file = new File(pathFile);
        try(FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line="";
            while ((line=bufferedReader.readLine())!=null){
                stringList.add(line);
            }
        } catch (IOException e) {
            System.out.println("lôi đọc file");
        }
        return stringList;
    }

}
