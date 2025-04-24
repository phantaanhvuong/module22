package mvc_arraylist.entity;

public class XeMay extends PhuongTien {
    private double congSuat;
    public XeMay(){

    }

    public XeMay(String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu, double congSuat) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return "XeMay{" +
                super.toString()+
                "congSuat=" + congSuat +
                '}';
    }
    public String getInForToFile2(){
        return this.getBienKiemSoat()+","+this.getTenHangSanXuat()+","+this.getNamSanXuat()+","+this.getChuSoHuu()+","+this.congSuat;
    }
}
