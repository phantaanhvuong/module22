package ss7_abstract_interface.thuc_hanh.interface_comparator;

import ss6_inheritance.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorCircleTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5,"indigo",false);
        System.out.println("Pre-sorted:");
        for (Circle circle : circles){
            System.out.println(circle);
        }
        ComparatorCircle comparatorCircle = new ComparatorCircle();
        Arrays.sort(circles,comparatorCircle);
        for (Circle circle : circles){
            System.out.println(circle);
        }
    }
}
