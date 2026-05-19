package MyrezEWalletSystem.Validation;

import MyrezEWalletSystem.exception.InvalidPhoneNumberException;

public  class PhoneNumberValidation {
    public static void checkPhoneNumber(String phone) throws InvalidPhoneNumberException {
        if  (phone.length() == 0) {
            throw new InvalidPhoneNumberException("empty phone number exception !");
        }
        if (phone.length() < 11) {
            throw new InvalidPhoneNumberException("phone number less than 11 digits");
        }
        if (phone.length() > 11) {
            throw new InvalidPhoneNumberException("the number is more than 11 digits!!");

        }

        if (!phone.matches("\\d+")) {
            throw new InvalidPhoneNumberException("phone number must contain only digits!")
                    ;
        }
        if (!phone.startsWith("01")) {
            throw new InvalidPhoneNumberException("Not Valid Phone Number Starting Exception");
        } else {
            System.out.println("the phone is created successfully ");
        }
    }
}
