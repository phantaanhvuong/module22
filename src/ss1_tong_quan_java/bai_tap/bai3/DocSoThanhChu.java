package ss1_tong_quan_java.bai_tap.bai3;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số dưới 100 :");
        int number = scanner.nextInt();
        int phanNguyen = 0;
        int phanDu = 0;
        String donVi = "";
        String hangChuc = "";
        boolean repeat = true;
        while (repeat){
            if(phanDu !=0){
                number = phanDu;
            }
            if (number < 20) {
                repeat = false;
                switch (number) {
                    case 0:
                        donVi = "zero";
                        break;
                    case 1:
                        donVi = "one";
                        break;
                    case 2:
                        donVi = "two";
                        break;
                    case 3:
                        donVi = "three";
                        break;
                    case 4:
                        donVi = "four";
                        break;
                    case 5:
                        donVi = "five";
                        break;
                    case 6:
                        donVi = "six";
                        break;
                    case 7:
                        donVi = "seven";
                        break;
                    case 8:
                        donVi = "eight";
                        break;
                    case 9:
                        donVi = "night";
                        break;
                    case 10:
                        hangChuc = "ten";
                        break;
                    case 11:
                        hangChuc = "eleven";
                        break;
                    case 12:
                        hangChuc = "Twelve";
                        break;
                    case 13:
                        hangChuc = "Thirteen";
                        break;
                    case 14:
                        hangChuc = "Fourteen";
                        break;
                    case 15:
                        hangChuc = "Fifteen";
                        break;
                    case 16:
                        hangChuc = " Sixteen";
                        break;
                    case 17:
                        hangChuc = " Seventeen";
                        break;
                    case 18:
                        hangChuc = " Eighteen";
                        break;
                    case 19:
                        hangChuc = "Nineteen";
                        break;
                    case 20:
                        hangChuc = "Twenty";
                        break;

                }

            }
            else  {
                phanDu = number % 10;
                phanNguyen = number / 10;
                if (phanDu == 0){
                    repeat = false;
                }
                switch (phanNguyen) {
                    case 3:
                        hangChuc = "Thirty";
                        break;
                    case 4:
                        hangChuc = " Forty";
                        break;
                    case 5:
                        hangChuc = " Fifty";
                        break;
                    case 6:
                        hangChuc = "Sixty";
                        break;
                    case 7:
                        hangChuc = "Seventy";
                        break;
                    case 8:
                        hangChuc = "Eighty";
                        break;
                    case 9:
                        hangChuc = " Ninety";
                        break;
                }
            }
        }

        System.out.println(hangChuc + " "+ donVi);
    }
}

