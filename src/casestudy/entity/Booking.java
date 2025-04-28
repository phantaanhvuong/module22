package casestudy.entity;

public class Booking {
    private int maBooking;
    private int ngayBooking;
    private int ngayBatDauThue;
    private int ngayKetThucThue;
    private int maKhachHang;
    private int maDichVu;

    public Booking() {
    }

    public Booking(int maBooking, int ngayBooking, int ngayBatDauThue, int ngayKetThucThue, int maKhachHang, int maDichVu) {
        this.maBooking = maBooking;
        this.ngayBooking = ngayBooking;
        this.ngayBatDauThue = ngayBatDauThue;
        this.ngayKetThucThue = ngayKetThucThue;
        this.maKhachHang = maKhachHang;
        this.maDichVu = maDichVu;
    }

    public int getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(int maBooking) {
        this.maBooking = maBooking;
    }

    public int getNgayBooking() {
        return ngayBooking;
    }

    public void setNgayBooking(int ngayBooking) {
        this.ngayBooking = ngayBooking;
    }

    public int getNgayBatDauThue() {
        return ngayBatDauThue;
    }

    public void setNgayBatDauThue(int ngayBatDauThue) {
        this.ngayBatDauThue = ngayBatDauThue;
    }

    public int getNgayKetThucThue() {
        return ngayKetThucThue;
    }

    public void setNgayKetThucThue(int ngayKetThucThue) {
        this.ngayKetThucThue = ngayKetThucThue;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public int getMaDichVu() {
        return maDichVu;
    }

    public void setMaDichVu(int maDichVu) {
        this.maDichVu = maDichVu;
    }
}
