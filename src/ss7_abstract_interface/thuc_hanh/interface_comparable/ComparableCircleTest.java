package ss7_abstract_interface.thuc_hanh.interface_comparable;

import java.util.Arrays;

public class
ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] comparableCircles = new ComparableCircle[3];
        comparableCircles[0] = new ComparableCircle(3.6);
        comparableCircles[1] = new ComparableCircle();
        comparableCircles[2] = new ComparableCircle(3.5,"indigo",false);
        System.out.println("Pre-sorted:");
        for (ComparableCircle comparableCircle : comparableCircles){
            System.out.println(comparableCircle);
        }
        Arrays.sort(comparableCircles);
        System.out.println("After-sorted:");
        for (ComparableCircle comparableCircle : comparableCircles){
            System.out.println(comparableCircle);
        }
    }
}
