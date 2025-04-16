package bai_lam_them_mvc.entity;

public class XeTai extends PhuongTien{
    private int trongTai;
    public XeTai(){

    }


    public XeTai(String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu, int trongTai) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;
    }

    public int getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(int trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return "XeTai{" +
                super.toString()+
                "trongTai=" + trongTai +
                '}';
    }
}
