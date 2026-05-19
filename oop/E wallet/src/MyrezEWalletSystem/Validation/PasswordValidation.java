package MyrezEWalletSystem.Validation;

import MyrezEWalletSystem.exception.InvalidPasswordException;
import MyrezEWalletSystem.model.EWallet;

public class PasswordValidation {
    //    PasswordValidation passwordValidation=new PasswordValidation();
    public void checkPassword(String password) throws InvalidPasswordException {
        String regex = "^(?=(.*\\d){6,})(?=(.*[A-Za-z]){2,})(?=.*[A-Z])(?=.*[^A-Za-z0-9]).*$";
        if (!password.matches(regex)) {
            throw new InvalidPasswordException("The password must contain at least 6 digits, 2 letters, 1 uppercase letter, and 1 symbol!"
            );
        }
    }
}
