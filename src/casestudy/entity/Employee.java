package casestudy.entity;

public class Employee extends Person{
    private String trinhDo;
    private String viTri;
    private int luong;

    public Employee() {
    }

    public Employee(int maNhanVien, String hoTen, int ngaySinh, String gioiTinh, int soCMND, int sodienThoai, String email, String trinhDo, String viTri, int luong) {
        super(maNhanVien, hoTen, ngaySinh, gioiTinh, soCMND, sodienThoai, email);
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }
}
