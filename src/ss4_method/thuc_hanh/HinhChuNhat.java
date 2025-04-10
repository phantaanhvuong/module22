package ss4_method.thuc_hanh;

public class HinhChuNhat {
    double dai, rong;

    public HinhChuNhat() {
    }

    public HinhChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public double getDienTich() {
        return this.dai * this.rong;
    }

    public double getChuVi() {
        return (this.dai + this.rong) * 2;
    }

    public String display() {
        return "hình chữ nhật{" + "độ dài = " + dai + ", độ rộng = " + rong + "}";
    }

}
