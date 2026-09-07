package MyrezEWalletSystem.Validation;

import MyrezEWalletSystem.exception.InvalidUserNameException;

public class UserNameValidation {
    public void checkUserName(String name)throws InvalidUserNameException {
        String regex = "^[A-Za-z0-9]{3,15}$";
        if (!name.matches(regex)){
            throw new InvalidUserNameException("Username must be 3-15 characters and contain only letters and numbers");

        }

    }
}
