package ss19_string_regex.bai_tap.validate_sdt;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SDTExample {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String SDT_REGEX = "^[(]\\d{2}[)]-[(]0\\d{9}[)]$";
    public SDTExample(){
        pattern = Pattern.compile(SDT_REGEX);
    }
    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
