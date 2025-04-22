package ss12_set_map.bai_tap.service;

import mvc_arraylist.repository.OtoRepository;
import ss12_set_map.bai_tap.entity.Product;
import ss12_set_map.bai_tap.repository.IProductRepository;
import ss12_set_map.bai_tap.repository.ProductRepository;

import java.util.ArrayList;

public class ProductService implements IProductService{
    private IProductRepository productRepository = new ProductRepository();

    @Override
    public ArrayList<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void add(Product product) {
        productRepository.add(product);
    }

    @Override
    public void deleteProduct(Product product) {
        productRepository.deleteProduct(product);
    }

    @Override
    public Product searchId(int id) {
        return productRepository.searchId(id);
    }

    @Override
    public void update(Product product) {
        productRepository.updateProduct(product);
    }


    @Override
    public ArrayList<Product> findNameProduct(String name) {
        return productRepository.findNameProduct(name);
    }
}
