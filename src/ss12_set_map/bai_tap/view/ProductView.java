package ss12_set_map.bai_tap.view;

import ss12_set_map.bai_tap.entity.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductView {
    private static final Scanner scanner = new Scanner(System.in);

    public static void disPlay(ArrayList<Product> products) {
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i));
        }
    }

    public static Product addProduct() {
        System.out.println("nhập id sản phẩm");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên sản phẩm");
        String name = scanner.nextLine();
        System.out.println("nhập giá sản phẩm");
        long price = Long.parseLong(scanner.nextLine());
        return new Product(id, name, price);
    }
    public static int searchId(){
        System.out.println("Nhập id cần sửa");
        return Integer.parseInt(scanner.nextLine());
    }


    public static Product updateProduct(Product product) {
        System.out.println("nhập id muốn sửa");
        product.setId(Integer.parseInt(scanner.nextLine())); ;
        System.out.println("nhập tên sản phẩm");
        product.setNameProduct(scanner.nextLine());
        System.out.println("nhập giá sản phẩm");
        product.setPrice(Long.parseLong(scanner.nextLine()));
        return product;

    }

    public static String findName() {
        System.out.println("Nhập tên bạn muốn tìm");
        return scanner.nextLine();
    }
}
