package casestudy.view;

import casestudy.common.Validator;
import casestudy.entity.Customer;

import java.util.List;
import java.util.Scanner;

public class CustomerView {
    public static final Scanner scanner = new Scanner(System.in);
    public static void displayCustomer(List<Customer> customers){
        for (int i = 0; i < customers.size(); i++) {
            System.out.println(customers.get(i));
        }
    }
    public static Customer addcustomer(){
        System.out.println("Nhập mã khách hàng");
        String maKhachHang = Validator.validateInput("KH-\\d{4}","sai định dạng vui lòng nhập lại. Ví dụ: KH-1234");
        System.out.println("nhập họ và tên khách hàng");
        String name = Validator.validateInput("^([A-Z][a-z]*)\\s([A-Z][a-z]*\\s)*([A-Z][a-z]*)$","tên sai định dạng vui lòng nhập lại. Viết hoa đầu mỗi từ");
        String ngaySinh;
        while (true){
            System.out.println("nhập ngày sinh khách hàng (dd/MM/yyyy), đủ 18 tuổi");
            ngaySinh = scanner.nextLine();
            if (Validator.isValidNgaySinh(ngaySinh)){
                break;
            }
            System.out.println("ngày sinh không hợp lệ, vui lòng nhập lại!(dd/MM/yyyy)");
        }
        System.out.println("nhập giới tính khách hàng (nam/nữ)");
        String gioiTinh = Validator.validateInput("(?i)^(nam|nữ)$","nhập giới tính không hợp lệ vui lòng nhập lại(nam/nữ)");
        System.out.println("nhập CMND khách hàng");
        String soCMND = Validator.validateInput("^\\d{9}|\\d{12}$", "CMND sai định dạng vui lòng nhập lại (phải có 9 hoặc 12 số)");
        System.out.println("nhập số điện thoại khách hàng");
        String soDienThoai = Validator.validateInput("^0\\d{9}$"," SĐT sai định dạng vui lòng nhập lại(bắt đầu bằng 0, đủ 10 số)");
        System.out.println("nhập email khách hàng");
        String email = Validator.validateInput("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$"," Email sai định dạng vui lòng nhập laị");
        System.out.println("nhập loại khách");
        String loaiKhach = scanner.nextLine();
        System.out.println("nhập địa chỉ khách hàng");
        String diaChi = scanner.nextLine();
        return new Customer(maKhachHang,name,ngaySinh,gioiTinh,soCMND,soDienThoai,email,loaiKhach,diaChi);
    }
    public static String SearchId(){
        System.out.println("nhập mã nhân viên cần sửa");
        return scanner.nextLine();
    }
    public static void updateCustomer(Customer customer){
        System.out.println("nhập họ và tên mới");
        String hoten = Validator.validateInput("^([A-Z][a-z]*)\\s([A-Z][a-z]*\\s)*([A-Z][a-z]*)$","tên sai định dạng vui lòng nhập lại. Viết hoa đầu mỗi từ");
        customer.setHoTen(hoten);
        String ngaySinh;
        while (true){
            System.out.println("nhập ngày sinh khách hàng (dd/MM/yyyy), đủ 18 tuổi");
            ngaySinh = scanner.nextLine();
            if (Validator.isValidNgaySinh(ngaySinh)){
                break;
            }
            System.out.println("ngày sinh không hợp lệ, vui lòng nhập lại!(dd/MM/yyyy)");
        }
        customer.setNgaySinh(ngaySinh);
        System.out.println("nhập giới tính");
        String gioiTinh = Validator.validateInput("(?i)^(nam|nữ)$","nhập giới tính không hợp lệ vui lòng nhập lại(nam/nữ)");
        customer.setGioiTinh(gioiTinh);
        System.out.println("nhập số CMND mới");
        String soCMND = Validator.validateInput("^\\d{9}|\\d{12}$", "CMND sai định dạng vui lòng nhập lại (phải có 9 hoặc 12 số)");
        customer.setSoCMND(soCMND);
        System.out.println("nhập số điện thoại mới");
        String soDienThoai = Validator.validateInput("^0\\d{9}$"," SĐT sai định dạng vui lòng nhập lại(bắt đầu bằng 0, đủ 10 số)");
        System.out.println("nhấp email mới");
        String email = Validator.validateInput("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$"," Email sai định dạng vui lòng nhập laị");
        customer.setEmail(email);
        System.out.println("nhập loại khách");
        customer.setLoaiKhach(scanner.nextLine().trim());
        System.out.println("nhập địa chỉ mới");
        customer.setDiaChi(scanner.nextLine().trim());
    }
}
