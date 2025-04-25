package ss12_set_map.bai_tap.controller;

import ss12_set_map.bai_tap.arrange.SortAscending;
import ss12_set_map.bai_tap.arrange.SortDescending;
import ss12_set_map.bai_tap.entity.Product;
import ss12_set_map.bai_tap.service.ProductService;
import ss12_set_map.bai_tap.view.ProductView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductController {
    private static ProductService productService = new ProductService();
    private static Scanner scanner = new Scanner(System.in);

    public static void Menu() {


        boolean flag = true;
        do {
            System.out.println("Chương trình quản lý sản phẩm" +
                    "\n chọn chức năng" +
                    "\n 1. hiển thị sản phẩm" +
                    "\n 2. thêm mới sản phẩm" +
                    "\n 3. xóa sản phẩm " +
                    "\n 4. sửa sản phẩm " +
                    "\n 5. tìm kiếm sản phẩm" +
                    "\n 6. sắp xếp" +
                    "\n 7. thoát chương trình"
            );
            Scanner scanner = new Scanner(System.in);
            System.out.println("chọn chức năng");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    List<Product> products = productService.findAll();
                    ProductView.disPlay(products);
                    break;
                case 2:
                    Product product = ProductView.addProduct();
                    productService.add(product);
                    System.out.println("Đã thêm thành công");
                    break;

                case 3:
                    System.out.println("nhập id cần xóa");
                    int deleteId = Integer.parseInt(scanner.nextLine());
                    boolean check = productService.deleteById(deleteId);
                    if (check){
                        System.out.println("xoa thanh cong");
                    }else {
                        System.out.println("khong tim thay id");
                    }
//                    Product product1 = productService.searchId(deleteId);

//                    if (product1 != null) {
//                        productService.deleteProduct(product1);
//                        System.out.println("Xóa thành công");
//                    } else {
//                        System.out.println("id không tồn tại");
//                    }
                    break;
                case 4:
                    Product productEdit = productService.searchId(ProductView.searchId());
                    if (productEdit == null) {
                        System.out.println("Không có");
                    } else {
                        ProductView.updateProduct(productEdit);
                        productService.update(productEdit);
                    }
                    break;
                case 5:
                    ArrayList<Product> products1 = productService.findNameProduct(ProductView.findName());
                    ProductView.disPlay(products1);
                    break;
                case 6:
                    sort();
                    break;
                default:
                    flag = false;
            }
        } while (flag);
    }

    public static void sort() {
        int choice;
        do {
            System.out.println("chọn chức năng" +
                    "\n 1. sắp xếp tăng dần" +
                    "\n 2. sắp xếp giảm dần" +
                    "\n 3. quay lại chương trình"
            );
            choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                List<Product> products = productService.findAll();
                products.sort(new SortAscending());
                ProductView.disPlay(productService.findAll());
            }
            if (choice == 2) {
                List<Product> products = productService.findAll();
                products.sort(new SortDescending());
                ProductView.disPlay(productService.findAll());
            } else {
                return;
            }
        } while (true);
    }
}
