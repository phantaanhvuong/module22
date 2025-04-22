package ss12_set_map.bai_tap.service;

import ss12_set_map.bai_tap.entity.Product;

import java.util.ArrayList;

public interface IProductService {
    ArrayList<Product> findAll();
    void add(Product product);
    void deleteProduct(Product product);
    Product searchId(int id);
    void update(Product product);

    ArrayList<Product> findNameProduct(String name);
}
