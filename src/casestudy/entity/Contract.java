package casestudy.entity;

public class Contract {
    private int soHopDong;
    private int maBooking;
    private int soTienCocTruoc;
    private int soTienThanhToan;

    public Contract() {
    }

    public Contract(int soHopDong, int maBooking, int soTienCocTruoc, int soTienThanhToan) {
        this.soHopDong = soHopDong;
        this.maBooking = maBooking;
        this.soTienCocTruoc = soTienCocTruoc;
        this.soTienThanhToan = soTienThanhToan;
    }

    public int getSoHopDong() {
        return soHopDong;
    }

    public void setSoHopDong(int soHopDong) {
        this.soHopDong = soHopDong;
    }

    public int getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(int maBooking) {
        this.maBooking = maBooking;
    }

    public int getSoTienCocTruoc() {
        return soTienCocTruoc;
    }

    public void setSoTienCocTruoc(int soTienCocTruoc) {
        this.soTienCocTruoc = soTienCocTruoc;
    }

    public int getSoTienThanhToan() {
        return soTienThanhToan;
    }

    public void setSoTienThanhToan(int soTienThanhToan) {
        this.soTienThanhToan = soTienThanhToan;
    }
}
