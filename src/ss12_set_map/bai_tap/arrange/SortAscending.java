package ss12_set_map.bai_tap.arrange;

import ss12_set_map.bai_tap.entity.Product;

import java.util.Comparator;

public class SortAscending implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o1.getPrice() - o2.getPrice());
    }
}
