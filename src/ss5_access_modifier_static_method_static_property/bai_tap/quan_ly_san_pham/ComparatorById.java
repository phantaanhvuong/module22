package ss5_access_modifier_static_method_static_property.bai_tap.quan_ly_san_pham;

import java.util.Comparator;

public class ComparatorById implements Comparator<Product> {


    @Override
    public int compare(Product o1, Product o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
