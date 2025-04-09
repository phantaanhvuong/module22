package ss3_mang_trong_java.bai_tap;

import java.util.Scanner;

public class DemKiTuXuatHien {
    public static void main(String[] args) {
        String str = "sfhd fnsfn,ưdhuwrvh, vnerv";
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập kí tự bạn muốn đếm: ");
        char kiTu = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==kiTu){
                count ++;
            }
        }
        System.out.println("ký tự "+ kiTu +" xuất hện "+ count+ " lần trong chuổi");
    }
}
