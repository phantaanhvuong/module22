package ss7_abstract_interface.bai_tap.interface_resizeable_hinh_hoc;

import ss7_abstract_interface.bai_tap.interface_colorable.Colorable;

public class Square extends Shape implements Resizeable, Colorable {
    private double side = 1.0;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return this.side * this.side;
    }

    public double getPerimeter() {
        return this.side * 2;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                " area=" + getArea()+
                '}';
    }

    @Override
    public void resize(double percent) {
        setSide(getSide() + (getSide() * percent / 100));
    }

    @Override
    public void howToColor() {
        System.out.println("OK");
    }
}
