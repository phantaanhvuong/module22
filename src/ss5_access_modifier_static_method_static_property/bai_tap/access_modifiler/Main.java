package ss5_access_modifier_static_method_static_property.bai_tap.access_modifiler;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle circle1 = new Circle(3.0);
        System.out.println("Circle 1 radius: " + circle.getRadius());
        System.out.println("Circle 1 area: " + circle.getArea());

        System.out.println("Circle 2 radius: " + circle1.getRadius());
        System.out.println("Circle 2 area: " + circle1.getArea());
    }

}
