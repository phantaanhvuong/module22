package ss1_tong_quan_java.thuc_hanh.thuc_hanh4;

import java.util.Scanner;

public class GiaiPTBac1 {
    public static void main(String[] args) {
        System.out.println("phương trình bậc nhất");
        System.out.println("a * x + b =c");
        Scanner scanner = new Scanner(System.in);
        System.out.println("a: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("b: ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("c: ");
        double c = Double.parseDouble(scanner.nextLine());
        System.out.println("nhập tên");
        String name = scanner.nextLine();
        System.out.println("tên "+name);
        if (a!=0){
            double x = (c-b)/a;
            System.out.println("phương trình có nghiệm x là: " +x);
        }else if (b==c){
            System.out.println("phương trình vô số nghiệm");
        }else {
            System.out.println("phương trình vô nghiệm");
        }
    }
}
