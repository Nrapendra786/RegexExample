package org.example;

import java.util.Arrays;
import java.util.regex.Pattern;

public class PhoneValidator {

    // Regex pattern to valid phone number
    private static final String PHONE_REGEX_TYPE_ONE = "\\d{10}";

    private static final String PHONE_REGEX_TYPE_TWO = "\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}";

    private static final String PHONE_REGEX_TYPE_THREE = "\\d{3}-\\d{3}-\\d{4}\\s(x|(ext))\\d{3,5}";

    private static final String PHONE_REGEX_TYPE_FOUR = "\\(\\d{3}\\)-\\d{3}-\\d{4}";


    private static boolean validatePhoneNumber(String phoneNumber) {
        var patZero = Pattern.compile(PHONE_REGEX_TYPE_ONE,Pattern.CASE_INSENSITIVE);
        var patOne = Pattern.compile(PHONE_REGEX_TYPE_TWO,Pattern.CASE_INSENSITIVE);
        var patTwo = Pattern.compile(PHONE_REGEX_TYPE_THREE, Pattern.CASE_INSENSITIVE);
        var patThree = Pattern.compile(PHONE_REGEX_TYPE_FOUR,Pattern.CASE_INSENSITIVE);

        return Arrays.asList(patZero,patOne,patTwo,patThree).stream().filter(patternRef -> patternRef.matcher(phoneNumber).find()).count() > 0;
    }

    public static void main(String[] args) {
        System.out.println("Phone number 1234567890 validation result: "+validatePhoneNumber("1234567890"));
        System.out.println("Phone number 123-456-7890 validation result: "+validatePhoneNumber("123-456-7890"));
        System.out.println("Phone number 123-456-7890 x1234 validation result: "+validatePhoneNumber("123-456-7890 x1234"));
        System.out.println("Phone number 123-456-7890 ext1234 validation result: "+validatePhoneNumber("123-456-7890 ext1234"));
        System.out.println("Phone number (123)-456-7890 validation result: "+validatePhoneNumber("(123)-456-7890"));
        System.out.println("Phone number 123.456.7890 validation result: "+validatePhoneNumber("123.456.7890"));
        System.out.println("Phone number 123 456 7890 validation result: "+validatePhoneNumber("123 456 7890"));
    }


}
