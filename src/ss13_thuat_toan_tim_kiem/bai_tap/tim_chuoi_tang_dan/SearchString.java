package ss13_thuat_toan_tim_kiem.bai_tap.tim_chuoi_tang_dan;

import java.util.Scanner;

public class SearchString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào một chuổi");
        String input = scanner.nextLine();
        System.out.println("chuôỉ lớn nhất được sắp xếp là "+ linearSearch(input));
    }
    public  static String linearSearch (String string){
        char c = string.charAt(0);
        String result = String.valueOf(c);
        for (int i = 1; i < string.length(); i++) {
            if (c < string.charAt(i)){
                result += string.charAt(i);
                c = string.charAt(i);
            }

        }
        return result;
    }

}
