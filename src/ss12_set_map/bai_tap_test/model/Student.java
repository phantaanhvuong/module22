package ss12_set_map.bai_tap_test.model;

import java.io.Serializable;

public class Student implements Serializable {
    private int id;
    private String name;
    private double dtb;
    private String xepLoai;

    public Student() {
    }

    public Student(int id, String name, double dtb, String xepLoai) {
        this.id = id;
        this.name = name;
        this.dtb = dtb;
        this.xepLoai = xepLoai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDtb() {
        return dtb;
    }

    public void setDtb(double dtb) {
        this.dtb = dtb;
    }

    public String getXepLoai() {
        return xepLoai;
    }

    public void setXepLoai(String xepLoai) {
        this.xepLoai = xepLoai;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dtb=" + dtb +
                ", xepLoai='" + xepLoai + '\'' +
                '}';
    }
}
