package ss15_exception_and_debug.bai_tap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        while (true){
            try {
                System.out.println("nhập cạnh thứ nhất");
                a = Integer.parseInt(scanner.nextLine());
                System.out.println("nhập cạnh thứ hai");
                b = Integer.parseInt(scanner.nextLine());
                System.out.println("nhập cạnh thứ ba");
                c = Integer.parseInt(scanner.nextLine());
                checkTriangle(a,b,c);
                System.out.println("đây là ba cạnh của tam giác");
                break;
            }catch (IllegalTriangleException e){
                System.err.println(e.getMessage());
            }catch (NumberFormatException e){
                System.err.println("nhập đúng dạng số");
            }catch (Exception e){
                e.printStackTrace();
            }

        }


    }

    public static void checkTriangle(int a, int b, int c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("Không được nhập số âm hoặc bằng 0");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("Đây không phải ba cạnh của tam giác");
        }

    }
}
