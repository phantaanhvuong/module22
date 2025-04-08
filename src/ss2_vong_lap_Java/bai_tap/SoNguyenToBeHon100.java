package ss2_vong_lap_Java.bai_tap;

public class SoNguyenToBeHon100 {
    public static void main(String[] args) {
        int number = 2;

        while (number < 100) {
            boolean soNguyenTo = true;

            if (number < 2) {
                soNguyenTo = false;
            } else {
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        soNguyenTo = false;
                        break;
                    }
                }
            }

            if (soNguyenTo) {
                System.out.print(number + ",");
            }

            number++;
        }
    }
}
