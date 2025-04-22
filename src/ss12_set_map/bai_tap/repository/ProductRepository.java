package ss12_set_map.bai_tap.repository;

import ss12_set_map.bai_tap.entity.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ProductRepository implements IProductRepository {
    public static ArrayList<Product> products = new ArrayList<>();

    static {
        products.add(new Product(133, "Điện thoại", 200000));
        products.add(new Product(323, "Lap top", 5000000));
        products.add(new Product(646, "Tai nghe", 97979979));
        products.add(new Product(878, "Ti vi", 92929292));
    }

    @Override
    public ArrayList<Product> findAll() {
        return products;
    }

    @Override
    public void add(Product product) {
        products.add(product);
    }

    @Override
    public Product searchId(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                return products.get(i);
            }
        }
        return null;
    }

    @Override
    public void deleteProduct(Product product) {
        products.remove(product);
    }

    @Override
    public void updateProduct(Product product) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == product.getId()) {
                products.set(i, product);
                break;
            }

        }
    }


    @Override
    public ArrayList<Product> findNameProduct(String name) {
        ArrayList<Product> products1 = new ArrayList<>();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getNameProduct().toLowerCase().contains(name.toLowerCase())) {
                products1.add(products.get(i));

            }
        }
        return products1;
    }

}
