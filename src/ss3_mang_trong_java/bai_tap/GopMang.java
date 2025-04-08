package ss3_mang_trong_java.bai_tap;

public class GopMang {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 2, 5, 6};
        int[] arr2 = {3, 55, 33, 44, 12, 3};
        int[] arr3 = new int[arr.length + arr2.length];
        for (int i = 0; i < arr.length; i++) {
            arr3[i] = arr[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[i + arr.length] = arr2[i];
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
