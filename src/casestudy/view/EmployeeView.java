package casestudy.view;

import casestudy.common.Validator;
import casestudy.entity.Employee;

import java.util.List;
import java.util.Scanner;

public class EmployeeView {
    public static final Scanner scanner = new Scanner(System.in);
    public static void displayEmployee(List<Employee> employees){
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }
    }
    public static Employee addEmployee(){
        System.out.println("nhâp mã nhân viên");
        String maNhanVien = Validator.validateInput("NV-\\d{4}", "Sai định dạng vui lòng nhập lai. Ví dụ hợp lệ: NV-1234");
        System.out.println("nhập họ và tên nhân viên");
        String name = Validator.validateInput("^([A-Z][a-z]*)\\s([A-Z][a-z]*\\s)*([A-Z][a-z]*)$", "Tên sai định dạng vui lòng nhập lại. Viết hoa đầu mỗi từ");

        String ngaySinh;
        while (true) {
            System.out.println("Nhập ngày sinh nhân viên(dd/MM/yyyy, đủ 18 tuổi):");
            ngaySinh = scanner.nextLine();
            if (Validator.isValidNgaySinh(ngaySinh)) {
                break;
            }
            System.out.println("Dữ liệu không hợp lệ, vui lòng nhập lại! dd/MM/yyyy");
        }
        System.out.println("nhập giới tính nhân viên");
        String gioiTinh = Validator.validateInput("(?i)^(nam|nữ)$","nhập giới tính không hợp lệ vui lòng nhập lại(nam/nữ)");
        System.out.println("nhập số CMND nhân viên");
        String soCMND = Validator.validateInput("^\\d{9}|\\d{12}$", "CMND sai định dạng vui lòng nhập lại (phải có 9 hoặc 12 số)");
        System.out.println("nhập số điện thoại nhân viên");
        String soDienThoai = Validator.validateInput("^0\\d{9}$"," SĐT sai định dạng vui lòng nhập lại(bắt đầu bằng 0, đủ 10 số)");
        System.out.println("nhập email nhân viên");
        String email = Validator.validateInput("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$"," Email sai định dạng vui lòng nhập laị");
        System.out.println("nhập trình độ nhân viên");
        String trinhDo = scanner.nextLine();
        System.out.println("nhập vị trí làm việc của nhân viên");
        String viTri = scanner.nextLine();
        System.out.println("nhập lương nhân viên");
        long luong = Validator.isValidLuong();
        return new Employee(maNhanVien,name,ngaySinh,gioiTinh,soCMND,soDienThoai,email,trinhDo,viTri,luong);
    }
    public static String searchId(){
        System.out.println("nhập mã nhân viên cần sửa");
        return scanner.nextLine();
    }
    public static void updateEmployee(Employee employee) {
//        System.out.println("Nhập mã nhân viên (định dạng NV-YYYY):");
//        String maNV = EmployeeValidator.validateInput("^NV-\\d{4}$", "Sai định dạng vui lòng nhập lai. Ví dụ hợp lệ: NV-1234");
//        employee.setMaNhanVien(maNV);
        System.out.println("Nhập họ và tên (viết hoa chữ cái đầu mỗi từ):");
        String hoTen = Validator.validateInput("^([A-Z][a-z]*)\\s([A-Z][a-z]*\\s)*([A-Z][a-z]*)$", "Tên sai định dạng vui lòng nhập lại. Viết hoa đầu mỗi từ.");
        employee.setHoTen(hoTen);
        String ngaySinh;
        while (true) {
            System.out.println("Nhập ngày sinh (dd/MM/yyyy):");
            ngaySinh = scanner.nextLine().trim();
            if (Validator.isValidNgaySinh(ngaySinh)) {
                break;
            } else {
                System.out.println("Ngày sinh không hợp lệ hoặc chưa đủ 18 tuổi.");
            }
        }
        employee.setNgaySinh(ngaySinh);
        System.out.println("Nhập giới tính:");
        String gioiTinh = Validator.validateInput("(?i)^(nam|nữ)$","nhập giới tính không hợp lệ vui lòng nhập lại(nam/nữ)");
        employee.setGioiTinh(gioiTinh);
        System.out.println("Nhập số CMND (9 hoặc 12 số):");
        String cmnd =  Validator.validateInput("^\\d{9}|\\d{12}$", "CMND sai định dạng vui lòng nhập lại (phải có 9 hoặc 12 số)");
        employee.setSoCMND(cmnd);
        System.out.println("Nhập số điện thoại (bắt đầu bằng 0, đủ 10 số):");
        String sdt = Validator.validateInput("^0\\d{9}$","SĐT sai định dạng vui lòng nhập lại(bắt đầu bằng 0, đủ 10 số)");
        employee.setSoDienThoai(sdt);
        System.out.println("Nhập email:");
        String email = Validator.validateInput("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$","Email sai định dạng vui lòng nhập laị");
        employee.setEmail(email);
        System.out.println("Nhập trình độ nhân viên:");
        employee.setTrinhDo(scanner.nextLine().trim());
        System.out.println("Nhập vị trí làm việc:");
        employee.setViTri(scanner.nextLine().trim());
        System.out.println("Nhập lương (lớn hơn 0):");
        long luong = Validator.isValidLuong();
        employee.setLuong(luong);
    }

}
