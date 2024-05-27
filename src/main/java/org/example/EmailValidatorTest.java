package org.example;

public class EmailValidatorTest {

    // list of valid email addresses
    private static final String[] validEmailIds = new String[] { "nrapendra@yahoo.com",
            "nrapendra-100@yahoo.com", "nrapendra.100@yahoo.com",
            "nrapendra111@nrapendra.com", "nrapendra-100@nrapendra.net",
            "nrapendra.100@nrapendra.com.au", "nrapendra@1.com",
            "nrapendra@gmail.com.com", "nrapendra+100@gmail.com",
            "nrapendra-100@yahoo-test.com", "nrapendra_100@yahoo-test.ABC.CoM"  };

    // list of invalid email addresses
    private static final String[] invalidEmailIds = new String[] { "nrapendra", "nrapendra@.com.my",
            "nrapendra123@gmail.a", "nrapendra123@.com", "nrapendra123@.com.com",
            ".nrapendra@nrapendra.com", "nrapendra()*@gmail.com", "nrapendra@%*.com",
            "nrapendra..2002@gmail.com", "nrapendra.@gmail.com",
            "nrapendra@nrapendra@gmail.com", "nrapendra@gmail.com.1a" };

    private static EmailValidator emailValidator;

    public static void main(String[] args) {
        emailValidator = new EmailValidator();
        for (String temp : validEmailIds) {
            boolean valid = emailValidator.validateEmail(temp);
            System.out.println("Email ID "+temp+" is valid? " + valid);
        }
        System.out.println("\n\n");
        for (String temp : invalidEmailIds) {
            boolean valid = emailValidator.validateEmail(temp);
            System.out.println("Email ID "+temp+" is valid? " + valid);
        }
    }

}