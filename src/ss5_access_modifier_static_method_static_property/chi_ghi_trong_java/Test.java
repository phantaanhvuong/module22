package ss5_access_modifier_static_method_static_property.chi_ghi_trong_java;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("vuong");
        student.setClasses("C02");
        System.out.println("name: " + student.getName() + " class: " + student.getClasses());
    }
}
