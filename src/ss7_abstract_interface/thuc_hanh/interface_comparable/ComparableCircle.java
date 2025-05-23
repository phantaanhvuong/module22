package ss7_abstract_interface.thuc_hanh.interface_comparable;

import ss6_inheritance.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle() {
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()){
            return 1;
        }else if ((getRadius()< o.getRadius())){
            return -1;
        }else {
            return 0;
        }

    }
//    @Override
//    public int compareTo(ComparableCircle c){
    //if (this.get
//        return this.getRadius() - c.getRadius();
//    }
}
