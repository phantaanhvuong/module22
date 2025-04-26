package ss19_string_regex.bai_tap.test;

public class Test {
    public static void main(String[] args) {
        String name = "Nguyen Minh Hai Ha ";
        String  regexName;
        regexName = "^[A-Z][a-z]*\\s([A-Z][a-z]+\\s)*([A-Z][a-z]*$)";
        regexName = "^\\(\\d{2}[)]-\\(0\\d{9}[)]$";
        boolean check = name.matches(regexName);
        System.out.println("ok");
    }
}
