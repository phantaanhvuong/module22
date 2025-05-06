package casestudy.entity;

public class Person {
    private String ma;
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private String soCMND;
    private String soDienThoai;
    private String email;


    public Person() {
    }

    public Person(String maNhanVien, String hoTen, String ngaySinh, String gioiTinh, String soCMND, String sodienThoai, String email) {
        this.ma = maNhanVien;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.soCMND = soCMND;
        this.soDienThoai = sodienThoai;
        this.email = email;

    }

    public String getMa() {
        return ma;
    }

    public void setMa(String maNhanVien) {
        this.ma = maNhanVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return
                "ma='" + ma + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", soCMND='" + soCMND + '\'' +
                ", soDienThoai='" + soDienThoai + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getInForToFilePerson(){
        return this.ma +"," +this.hoTen + ","+this.ngaySinh+"," +this.gioiTinh+","+this.soCMND+","+this.soDienThoai+","+this.email;
    }
}
