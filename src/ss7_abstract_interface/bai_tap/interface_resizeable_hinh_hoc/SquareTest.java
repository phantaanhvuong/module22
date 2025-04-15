package ss7_abstract_interface.bai_tap.interface_resizeable_hinh_hoc;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square(2.0);
        System.out.println(square);
        square.resize(50);
        System.out.println(square);


    }
}
