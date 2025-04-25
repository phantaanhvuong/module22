package ss12_set_map.bai_tap.repository;

import ss12_set_map.bai_tap.entity.Product;

import java.util.ArrayList;
import java.util.List;

public interface IProductRepository {
    List<Product> findAll();

    void add(Product product);
    Product searchId(int id);
    boolean deleteById(int id);
    void updateProduct(Product product);

    ArrayList<Product> findNameProduct(String name);
}
