package ss19_string_regex.bai_tap.validate_sdt;

import java.util.Scanner;

public class SDTExampleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SDTExample sdtExample = new SDTExample();
        while (true){
            System.out.println("nhap sdt dung dinh dang");
            String test = scanner.nextLine();
            if (sdtExample.validate(test)){
                System.out.println("dung dinh dang");
                break;
            }else{
                System.out.println("nhap lai");
            }
        }

    }

}
