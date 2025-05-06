package casestudy.common;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Validator {
    private static final Scanner scanner = new Scanner(System.in);

    public static String validateInput(String regex, String errorMessage) {
        while (true) {
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Input cannot be empty. Please enter again:");
                continue;
            }
            if (Pattern.matches(regex, input)) {
                return input;
            }
            System.out.println(errorMessage);
        }
    }

    public static boolean isValidNgaySinh(String input) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            LocalDate birthDate = LocalDate.parse(input, formatter);
            LocalDate today = LocalDate.now();
            Period age = Period.between(birthDate, today);
            return age.getYears() > 18 || (age.getYears() == 18 &&
                    (age.getMonths() > 0 || age.getDays() > 0));
        } catch (DateTimeParseException e) {
            return false;
        }
    }

//    public static boolean isValidCMND(String input) {
//        return input.matches("^\\d{9}|\\d{12}$");
//    }

//    public static boolean isValidSDT(String input) {
//        return input.matches("^0\\d{9}$");
//    }

    public static long isValidLuong() {
        while (true) {
            try {
                long luong = Long.parseLong(scanner.nextLine());
                if (luong > 0) {
                    return luong;
                } else {
                    System.out.println("Lỗi");
                }
            } catch (Exception e) {
                System.out.println("Lỗi");
            }
        }
    }

//    public static boolean isValidEmail(String input) {
//        return input.matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$");
//    }
}
