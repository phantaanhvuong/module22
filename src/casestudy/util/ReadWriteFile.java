package casestudy.util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {
    public static void writeFile(String filePath, List<String> stringList, boolean append){
        File file = new File(filePath);
        try (FileWriter fileWriter = new FileWriter(file,append);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)){
            for (String line : stringList){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

        } catch (IOException e) {
            System.out.println("lỗi đọc file");
        }

    }
    public static List<String> readFile(String filePath){
        List<String> stringList = new ArrayList<>();
        File file = new File(filePath);
        try (FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader)){
            String line = "";
            while ((line = bufferedReader.readLine()) != null){
                stringList.add(line);
            }


        } catch (IOException e) {
            System.out.println("lỗi đọc file");
        }
        return stringList;
    }
}
