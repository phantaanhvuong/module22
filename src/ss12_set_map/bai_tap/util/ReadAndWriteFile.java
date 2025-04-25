package ss12_set_map.bai_tap.util;

import org.w3c.dom.DOMStringList;
import ss12_set_map.bai_tap.entity.Product;

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
//     phương thức ghi
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

    public static void writeListProductToBinaryFile(String filepath, List<Product> productList) {
        File file = new File(filepath);
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);

            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(productList);
        } catch (FileNotFoundException e) {
            System.out.println("khong tim thay file");
        } catch (IOException e) {
            System.out.println("loi ghi file");
        } finally {
            try {
                objectOutputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                System.out.println("loi dong file");
            }
        }

    }

    public static List<Product> readBinaryFileTolistProduct(String filepath) {
        List<Product> productList1 = new ArrayList<>();
        File file = new File(filepath);
        try {
            if (file.length()>0){
                FileInputStream  fileInputStream = new FileInputStream(file);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                productList1 = (List<Product>) objectInputStream.readObject();
            }


        } catch (FileNotFoundException e) {
            System.out.println("loi khong tim thay file");
        } catch (IOException e) {
           e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return productList1;
    }
    // kieu cho all doi tuong
    public static <T> void wirteListObjectToDat(String pathFile, List<T> objectList){
        File file = new File(pathFile);
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try{
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(objectList);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("khong tim thay file");
        } catch (IOException e) {
            System.out.println("loi ghi file");
        }
    }
    public static <T> List<T> readListObjectFromDat(String pathFile){
        List<T> objectList = new ArrayList<>();
        File file = new File(pathFile);
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        if (file.length()>0){
            try {
                fileInputStream = new FileInputStream(file);
                objectInputStream = new ObjectInputStream(fileInputStream);
                objectList = (List<T>)objectInputStream.readObject();
            } catch (FileNotFoundException e) {
                System.out.println("loi ten file");
            } catch (ClassNotFoundException e) {
                System.out.println("loi doc file");
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        return objectList;
    }

}

