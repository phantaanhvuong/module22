package casestudy.entity;

public class Person {
    private int ma;
    private String hoTen;
    private int ngaySinh;
    private String gioiTinh;
    private int soCMND;
    private int sodienThoai;
    private String email;


    public Person() {
    }

    public Person(int maNhanVien, String hoTen, int ngaySinh, String gioiTinh, int soCMND, int sodienThoai, String email) {
        this.ma = maNhanVien;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.soCMND = soCMND;
        this.sodienThoai = sodienThoai;
        this.email = email;

    }

    public int getMaNhanVien() {
        return ma;
    }

    public void setMaNhanVien(int maNhanVien) {
        this.ma = maNhanVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(int ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(int soCMND) {
        this.soCMND = soCMND;
    }

    public int getSodienThoai() {
        return sodienThoai;
    }

    public void setSodienThoai(int sodienThoai) {
        this.sodienThoai = sodienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
