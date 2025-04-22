package ss12_set_map.bai_tap.arrange;

import ss12_set_map.bai_tap.entity.Product;

import java.util.Comparator;

public class SortDescending implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o2.getPrice() - o1.getPrice());
    }
}
