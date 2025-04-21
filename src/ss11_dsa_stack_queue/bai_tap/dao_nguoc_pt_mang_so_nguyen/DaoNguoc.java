package ss11_dsa_stack_queue.bai_tap.dao_nguoc_pt_mang_so_nguyen;

import java.util.ArrayList;
import java.util.Stack;

public class DaoNguoc {
    public static void DaoNguocMang(int[] arr){
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i< arr.length; i++){
            stack.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }

    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
        DaoNguocMang(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}
