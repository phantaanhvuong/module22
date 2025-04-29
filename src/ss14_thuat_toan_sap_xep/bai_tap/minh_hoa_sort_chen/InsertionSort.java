package ss14_thuat_toan_sap_xep.bai_tap.minh_hoa_sort_chen;

import java.util.Arrays;

public class InsertionSort {
    static int[] array = {8,4,2,4,-3,0,4,222,44,2,6,5,78,8,};
    public static void insertionSort(int[] array) {
        System.out.println("mảng ban đầu: ");
        System.out.println(Arrays.toString(array));
        int pos, x;
        for (int i = 1; i < array.length; i++) {
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1];
                pos--;
                System.out.println("chuyển đôi");
            }
            array[pos] = x;
            System.out.println(Arrays.toString(array));
        }
        System.out.println("mảng sau khi sắp xếp: ");
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        insertionSort(array);
    }
}
