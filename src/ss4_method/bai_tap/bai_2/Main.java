package ss4_method.bai_tap.bai_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        Scanner scanner = new Scanner(System.in);
        System.out.println("click Enter để dừng lại");
        scanner.nextLine();
        stopWatch.stop();
        System.out.println("Thời gian đã chạy: "+ stopWatch.getElapsedTime());
    }
}
