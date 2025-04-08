package ss2_vong_lap_Java.bai_tap;

public class SoNguyenTo {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;

        while (count < 20) {
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
                count++;
            }

            number++;
        }
    }
}
