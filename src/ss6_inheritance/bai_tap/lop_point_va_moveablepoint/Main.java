package ss6_inheritance.bai_tap.lop_point_va_moveablepoint;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(2,4);
        System.out.println(point);
        MovablePoint movablePoint = new MovablePoint(2,3,4,5);
        System.out.println(movablePoint);
        movablePoint.move();

        System.out.println(movablePoint);;


    }
}
