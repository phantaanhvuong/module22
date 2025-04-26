package ss19_string_regex.bai_tap.validate_class;

public class ClassExampleTest {
    private static ClassExample classExample;
    public static final String[] validClass = new String[]{"C0223G","A0323K"};
    public static final String[] invalidClass = new String[]{ "M0318G", "P0323A"};

    public static void main(String[] args) {
        classExample = new ClassExample();
        for (String isClass : validClass ){
            boolean isvalid = classExample.validate(isClass);
            System.out.println("class is " + isClass + " is valid: " + isvalid);
        }
        for (String isClass : invalidClass){
            boolean isvalid = classExample.validate(isClass);
            System.out.println("class is " + isClass + " is valid: " + isvalid);
        }
    }
}
