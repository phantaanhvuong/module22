package ss7_abstract_interface.bai_tap.interface_colorable;

import ss7_abstract_interface.bai_tap.interface_resizeable_hinh_hoc.Circle;
import ss7_abstract_interface.bai_tap.interface_resizeable_hinh_hoc.Rectangle;
import ss7_abstract_interface.bai_tap.interface_resizeable_hinh_hoc.Shape;
import ss7_abstract_interface.bai_tap.interface_resizeable_hinh_hoc.Square;

public class TestColorabale{
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Square(5.0);
        shapes[1] = new Circle(3.0);
        shapes[2] = new Rectangle(3.0,5.0);
        for (Shape shape : shapes){
            if (shape instanceof Circle){
                System.out.println("area circle= " + ((Circle) shape).getArea());
            }else if (shape instanceof Rectangle){
                System.out.println("area rectangle= " + ((Rectangle) shape).getArea());
            }else {
                Colorable colorable = (Square) shape;
                System.out.println("area square= " + ((Square) shape).getArea());
                colorable.howToColor();
            }
        }

    }


}
