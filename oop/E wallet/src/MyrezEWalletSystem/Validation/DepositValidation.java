package MyrezEWalletSystem.Validation;

import MyrezEWalletSystem.exception.InvalidDepositException;

public class DepositValidation  {
    public void checkDeposit( double amount)throws InvalidDepositException{
        if (amount == 0) {
            throw  new InvalidDepositException("Amount cannot be zero.");

        }

        // Rule: cannot be negative
        if (amount < 0) {
            throw  new InvalidDepositException("Amount cannot be negative.");
        }

        // Rule: cannot be a decimal like 5.2 — must be a whole number
        if (amount != Math.floor(amount)) {
            throw  new InvalidDepositException("Amount must be a whole number (no decimals like 5.2).");
        }

        // Rule: must be multiple of 50 (50, 100, 150, 200...)
        if (amount % 50 != 0) {
            throw  new InvalidDepositException("Amount must be a multiple of 50 (e.g., 50, 100, 150, 200).");
        }
    }
}
