package ss12_set_map.bai_tap.service;

import ss12_set_map.bai_tap.entity.Product;

import java.util.ArrayList;
import java.util.List;

public interface IProductService {
    List<Product> findAll();
    void add(Product product);
    boolean deleteById(int id);
    Product searchId(int id);
    void update(Product product);

    ArrayList<Product> findNameProduct(String name);
//    boolean deleteById (int id);
}
