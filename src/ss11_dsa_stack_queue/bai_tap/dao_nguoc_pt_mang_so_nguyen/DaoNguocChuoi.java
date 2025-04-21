package ss11_dsa_stack_queue.bai_tap.dao_nguoc_pt_mang_so_nguyen;

import java.util.Scanner;
import java.util.Stack;

public class DaoNguocChuoi {
    public static String daoNguocChuoi(String input){
        Stack<String> wStack = new Stack<>();
        String[] arr = input.split(" ");
        for (int i = 0; i < arr.length; i++) {
            wStack.push(arr[i]);
        }
        String output = "";
        while (!wStack.isEmpty()){
            String mWord = wStack.pop();
             output += mWord;
             if (!wStack.isEmpty()){
                 output += " ";
             }
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chuoi ki tu");
        String string = scanner.nextLine();
        String string1 = daoNguocChuoi(string);
        System.out.println(string1);
    }
}
