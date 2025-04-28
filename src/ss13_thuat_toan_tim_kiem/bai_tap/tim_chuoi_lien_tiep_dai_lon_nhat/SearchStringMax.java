package ss13_thuat_toan_tim_kiem.bai_tap.tim_chuoi_lien_tiep_dai_lon_nhat;

import java.util.Scanner;

public class SearchStringMax {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chuổi ký tự");
        String input = scanner.nextLine().toLowerCase();
        StringBuilder stringTest = new StringBuilder();
        String stringMax = "";
        for (int i = 0; i < input.length(); i++) {
            char index = input.charAt(i);
            if (stringTest.length()>0 && index< stringTest.charAt(stringTest.length()-1)){
                if (stringTest.length()>stringMax.length()){
                    stringMax = stringTest.toString();
                }
                stringTest.setLength(0);
            }
            stringTest.append(index);

        }
        if(stringTest.length()>stringMax.length()){
            stringMax = stringTest.toString();
        }
        System.out.println(stringMax);
    }





}
