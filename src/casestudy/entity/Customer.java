package casestudy.entity;

public abstract class Customer extends Person {

    private String loaiKhach;
    private String diaChi;

    public Customer() {
    }

    public Customer(int maNhanVien, String hoTen, int ngaySinh, String gioiTinh, int soCMND, int sodienThoai, String email, String loaiKhach, String diaChi) {
        super(maNhanVien, hoTen, ngaySinh, gioiTinh, soCMND, sodienThoai, email);
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
    }

    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}



