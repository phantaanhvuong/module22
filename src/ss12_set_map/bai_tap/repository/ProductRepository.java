package ss12_set_map.bai_tap.repository;

import ss12_set_map.bai_tap.entity.Product;
import ss12_set_map.bai_tap.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ProductRepository implements IProductRepository {
    private final String PRODUCT_FILE = "src/ss12_set_map/bai_tap/data/product.csv";
    private final boolean APPEND = true;
    private final boolean NOT_APPEND = false;
    //public static ArrayList<Product> products = new ArrayList<>();


    @Override
    public ArrayList<Product> findAll() {
        ArrayList<Product> productList = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFile(PRODUCT_FILE);
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            Product product = new Product(Integer.parseInt(array[0].trim()), array[1].trim(), Long.parseLong(array[2].trim()));
            productList.add(product);
        }
//
        return productList;
    }

    @Override
    public void add(Product product) {
//        products.add(product);
        List<String> stringList = new ArrayList<>();
        stringList.add(product.getInforToFile());
        ReadAndWriteFile.writeFile(PRODUCT_FILE, stringList, APPEND);
    }

    @Override
    public Product searchId(int id) {
        List<Product> productList = findAll();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                return productList.get(i);
            }
        }
        return null;
    }

    @Override
    public boolean deleteById(int id) {
//        products.remove(product);
        List<Product> productList = findAll();
        boolean check = false;
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getId()) {
                check = true;
                productList.remove(i);
                break;
            }
        }
        if (check) {
            List<String> stringList = new ArrayList<>();
            for (Product p : productList) {
                stringList.add(p.getInforToFile());
            }
            ReadAndWriteFile.writeFile(PRODUCT_FILE, stringList, NOT_APPEND);
        }

        return check;
    }

    @Override
    public void updateProduct(Product product) {
        List<Product> productList = findAll();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == product.getId()) {
                productList.set(i, product);
                break;
            }
        }
        List<String> stringList = new ArrayList<>();
        for (Product p : productList) {
            stringList.add(p.getInforToFile());
        }
        ReadAndWriteFile.writeFile(PRODUCT_FILE, stringList, NOT_APPEND);
    }


    @Override
    public ArrayList<Product> findNameProduct(String name) {
        List<Product> products = findAll();
        ArrayList<Product> products1 = new ArrayList<>();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getNameProduct().toLowerCase().contains(name.toLowerCase())) {
                products1.add(products.get(i));

            }
        }
        return products1;
    }

}
