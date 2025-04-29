package ss14_thuat_toan_sap_xep.bai_tap.cai_dat_sort_chen;

public class InsertionSort {
    static int[] list = {1,6,4,5,3,3,222,554,33,44,9,0,-3};
    public static void insertionSort(int[] array){
        int pos, x;
        for(int i = 1; i < array.length; i++){
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1];
                pos--;
            }
            array[pos] = x;
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }

}
