package ss2_vong_lap_Java.bai_tap;

import java.util.Scanner;

public class HienThiHinh {
    public static void main(String[] args) {
        int chon = -1;
        Scanner input = new Scanner(System.in);
        while(chon != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            chon = input.nextInt();
            switch (chon) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 8; j++) {
                            System.out.print("*");
                        }
                        System.out.println("*");
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 6; i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    for (int i = 1; i <= 5 ; i++) {
                        for (int j = 0; j < 6-i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    for (int i = 0; i <= 5; i++) {
                        for (int j = 1; j <= 6 - i; j++) {
                            System.out.print("  ");
                        }
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <=6; j++) {
                            if (j <= i) {
                                System.out.print("  ");
                            } else {
                                System.out.print("* ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 0; i <= 5; i++) {
                        for (int j = 1; j <= 6 - i; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
