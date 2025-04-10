package ss4_method.bai_tap.bai_1;

public class PhuongTrinhBacNhat {
    double a;
    double b;
    double c;


    public PhuongTrinhBacNhat(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDelTa() {
        return this.b * this.b - 4 * this.a * this.c;
    }

    public double getNghiem1() {
        return (-this.b + Math.pow(getDelTa(), 0.5)) / 2 * this.a;
    }

    public double getNghiem2() {
        return (-this.b - Math.pow(getDelTa(), 0.5)) / 2 * this.a;
    }

}
