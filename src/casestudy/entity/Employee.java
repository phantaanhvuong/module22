package casestudy.entity;

public class Employee extends Person {
    private String trinhDo;
    private String viTri;
    private long luong;

    public Employee() {
    }

    public Employee(String maNhanVien, String hoTen, String ngaySinh, String gioiTinh, String soCMND, String sodienThoai, String email, String trinhDo, String viTri, long luong) {
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

    public long getLuong() {
        return luong;
    }

    public void setLuong(long luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "Employee{" +
                super.toString() +
                "trinhDo='" + trinhDo + '\'' +
                ", viTri='" + viTri + '\'' +
                ", luong=" + luong +
                '}';
    }

    public String getInForToFileEmployee() {
        return super.getInForToFilePerson() + "," + this.trinhDo + "," + this.viTri + "," + this.luong;
    }
}
