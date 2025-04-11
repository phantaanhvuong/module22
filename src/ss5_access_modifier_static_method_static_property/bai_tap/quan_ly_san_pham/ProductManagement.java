package ss5_access_modifier_static_method_static_property.bai_tap.quan_ly_san_pham;

import javax.xml.namespace.QName;
import java.util.Scanner;

public class ProductManagement {
    Scanner scanner = new Scanner(System.in);
    public static Product[] products = new Product[100];

    static {
        products[0] = new Product(1, "iphone", 100000000);
        products[1] = new Product(2, "oppo", 604040040);
        products[2] = new Product(3, "samsung", 12628272);
    }

    public void displayProduct() {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                System.out.println(products[i].toString());
            }
        }
    }

    public void createProduct() {
        System.out.println("nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên của sản phẩm mới");
        String name = scanner.nextLine();
        System.out.println("nhập số tiền của sản phẩm");
        double price = Double.parseDouble(scanner.nextLine());
        Product product = new Product(id, name, price);

        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                break;
            }
        }
        displayProduct();
    }
    public void updateProduct(){
        System.out.println("nhập id bạn muốn sửa");
        int id = Integer.parseInt(scanner.nextLine());
        boolean isFind = false;
        for (int i = 0; i < products.length; i++) {
            if (id == products[i].getId()){
                System.out.println("nhập id mới");
                int newId = Integer.parseInt(scanner.nextLine());
                System.out.println("nhập tên sản phẩm mới");
                String newName = scanner.nextLine();
                System.out.println("nhập giá của sản phẩm mới");
                double newPrice = Double.parseDouble(scanner.nextLine());
                products[i].setId(newId);
                products[i].setName(newName);
                products[i].setPrice(newPrice);
                displayProduct();
                isFind = true;
                break;
            }
        }
        if (!isFind){
            System.out.println("id này không nằm trong danh sách");
        }
    }
    public void deleteProduct(){
        System.out.println("nhập í bạn muốn xoá");
        int id = Integer.parseInt(scanner.nextLine());
        int index = -1;
        for (int i = 0; i < products.length; i++) {
            if (products[i].getId() == id){
                index = i;
                break;
            }
        }
        if (index == -1){
            System.out.println("id bạn tìm không nằm trong danh sách");
        }else {
            for (int i = index; i < products.length-1; i++) {
                products[i] = products[i+1];
            }
            displayProduct();
        }
    }
    public void searchProduct(){
        System.out.println("nhập tên cần tìm");
        String name =scanner.nextLine().toLowerCase();
        for (int i = 0; i <products.length ; i++) {
            Product product = products[i];
            if (product.getName().toLowerCase().contains(name)){
                System.out.println(product);
                break;
            }
        }

    }
}
