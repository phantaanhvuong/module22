package ss16_io_text_file.text;

import ss1_tong_quan_java.bai_tap.bai1.Hello;

import java.io.*;

public class WriteATexFile {
    public static void main(String[] args) {
//        try {
//            FileWriter writer = new FileWriter("src/ss16_io_text_file/text/Hello.txt");
//            BufferedWriter bufferedWriter = new BufferedWriter(writer);
//            bufferedWriter.write("Hello Word!");
//            bufferedWriter.newLine();
//            bufferedWriter.write("Hello Vuong");
//            bufferedWriter.close();
//
//        } catch (IOException e) {
//          e.printStackTrace();
//        }

        try {
            FileReader reader = new FileReader("src/ss16_io_text_file/text/Hello.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
