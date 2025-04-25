package ss17_io_binary_file_va_seralization.bai_tap.copy_file_nhi_phan;

import java.io.*;
import java.util.Scanner;

public class FileCopyBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap duong dan tep nguon");
        String sourcePath = scanner.nextLine();
        File sourceFile = new File(sourcePath);
        if (!sourceFile.exists()){
            System.out.println("tep nguon khong ton tai");
            return;
        }
        System.out.println("nhap duong dan tep dich");
        String tagetPath = scanner.nextLine();
        File tagetFile = new File(tagetPath);
        if (!tagetFile.exists()){
            System.out.println("tep dich da ton tai");
            return;
        }
        try(InputStream inputStream = new FileInputStream(sourceFile);
            OutputStream outputStream = new FileOutputStream(tagetFile)){
            byte[] buffer = new byte[1024];
            int bytesRead;
            int totalBytes = 0;
            while ((bytesRead = inputStream.read(buffer)) != -1){
                outputStream.write(buffer,0,bytesRead);
                totalBytes += bytesRead;
            }
            System.out.println("sao chep thanh cong, so byte la:" +totalBytes);


        }catch (IOException e){
            System.out.println("xay ra loi khi sao chep"+ e.getMessage());
        }
    }
}
