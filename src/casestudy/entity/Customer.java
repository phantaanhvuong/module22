package casestudy.entity;

public  class Customer extends Person {

    private String loaiKhach;
    private String diaChi;

    public Customer() {
    }

    public Customer(String maNhanVien, String hoTen, String ngaySinh, String gioiTinh, String soCMND, String sodienThoai, String email, String loaiKhach, String diaChi) {
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

    @Override
    public String toString() {
        return "Customer{" +
                super.toString()+
                "loaiKhach='" + loaiKhach + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
    public String getInToFileCustomer(){
        return super.getInForToFilePerson()+","+this.loaiKhach+","+this.diaChi;
    }
}



