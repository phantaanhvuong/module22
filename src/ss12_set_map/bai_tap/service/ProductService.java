package ss12_set_map.bai_tap.service;

import ss12_set_map.bai_tap.entity.Product;
import ss12_set_map.bai_tap.repository.IProductRepository;
import ss12_set_map.bai_tap.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements IProductService{

    private IProductRepository productRepository = new ProductRepository();

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void add(Product product) {
        productRepository.add(product);
    }


    @Override
    public boolean deleteById(int id) {
        return productRepository.deleteById(id);
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
