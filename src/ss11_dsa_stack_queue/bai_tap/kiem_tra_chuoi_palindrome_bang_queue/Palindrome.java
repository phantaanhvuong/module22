package ss11_dsa_stack_queue.bai_tap.kiem_tra_chuoi_palindrome_bang_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();
        System.out.println("nhap chuoi muon kiem tra");
        String nhapChuoi = scanner.nextLine();
        String[] strings = nhapChuoi.split("");
        for (int i = 0; i < strings.length; i++) {
            stack.push(strings[i]);
            queue.add(strings[i]);

        }
        boolean kiemTra = true;
        for (int i = 0; i < strings.length/2; i++) {
            if (!stack.pop().equals(queue.poll())){
                kiemTra = false;
                break;
            }

        }
        if (kiemTra){
            System.out.println("day la chuoi palindrome");
        }else {
            System.out.println("khong phai la chuoi palindrome");
        }
    }

}
