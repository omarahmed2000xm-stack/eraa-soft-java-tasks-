package MyrezEWalletSystem.Validation;

import MyrezEWalletSystem.exception.InvalidWithdrawException;
import MyrezEWalletSystem.model.Account;

public class WithDrawValidation {
    public void checkWithDraw(double amount, Account account) throws InvalidWithdrawException {
        if (account == null) {
            throw new InvalidWithdrawException(
                    "Account not found"
            );
        }


        // zero or negative
        if (amount <= 0) {
            throw new InvalidWithdrawException(
                    "Withdraw amount must be greater than 0"
            );
        }

        // NaN
        if (Double.isNaN(amount)) {
            throw new InvalidWithdrawException(
                    "Invalid withdraw amount"
            );
        }

        // infinity
        if (Double.isInfinite(amount)) {
            throw new InvalidWithdrawException(
                    "Amount cannot be infinity"
            );
        }

        // minimum withdraw
        if (amount < 10) {
            throw new InvalidWithdrawException(
                    "Minimum withdraw amount is 10"
            );
        }

        // maximum withdraw
        if (amount > 50000) {
            throw new InvalidWithdrawException(
                    "Maximum withdraw amount is 50000"
            );
        }

        // insufficient balance
        if (amount > account.getBalance()) {
            throw new InvalidWithdrawException(
                    "Insufficient balance"
            );
        }

        // balance became negative
        if ((account.getBalance() - amount) < 0) {
            throw new InvalidWithdrawException(
                    "Balance cannot be negative"
            );
        }
    }


}

