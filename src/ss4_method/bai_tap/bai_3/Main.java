package ss4_method.bai_tap.bai_3;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setOn(true);
        fan1.setRadius(15);
        fan1.setColor("Red");
        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setOn(false);
        fan2.setRadius(2);
        fan2.setColor("Blue");
        System.out.println("Fan 1: " + fan1.toString());
        System.out.println("Fan 2: " + fan2.toString());
    }
}
