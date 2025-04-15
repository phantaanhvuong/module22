package ss7_abstract_interface.thuc_hanh.interface_comparator;

import ss6_inheritance.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Circle;

import java.util.Comparator;

public class ComparatorCircle implements Comparator<Circle> {
    @Override
    public int compare(Circle o1, Circle o2) {
        if (o1.getRadius() > o2.getRadius()){
            return 1;
        }else if (o1.getRadius() < o2.getRadius()){
            return -1;
        }else {
            return 0;
        }
    }
}
