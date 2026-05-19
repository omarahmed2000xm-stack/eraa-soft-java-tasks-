package MyrezEWalletSystem.Validation;

import MyrezEWalletSystem.exception.InvalidEmailException;

public class EmailValidation {
    public void checkEmail(String email)throws InvalidEmailException{
        if (email == null) {
            throw new InvalidEmailException("Email cannot be null");
        }

        // 2. empty / whitespace check
        if (email.trim().isEmpty()) {
            throw new InvalidEmailException("Email cannot be empty");
        }

        // 3. no spaces allowed
        if (email.contains(" ")) {
            throw new InvalidEmailException("Email cannot contain spaces");
        }

        // 4. must contain exactly one @
        int atCount = 0;
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                atCount++;
            }
        }
        if (atCount == 0) {
            throw new InvalidEmailException("Email must contain '@'");
        }
        if (atCount > 1) {
            throw new InvalidEmailException("Email must contain only one '@'");
        }

        // 5. cannot start with @ or .
        if (email.startsWith("@") || email.startsWith(".")) {
            throw new InvalidEmailException("Email cannot start with '@' or '.'");
        }

        // 6. cannot end with @ or .
        if (email.endsWith("@") || email.endsWith(".")) {
            throw new InvalidEmailException("Email cannot end with '@' or '.'");
        }

        // 7. split into local part and domain part
        int atIndex = email.indexOf('@');
        String localPart = email.substring(0, atIndex);
        String domainPart = email.substring(atIndex + 1);

        // 8. local part cannot be empty
        if (localPart.isEmpty()) {
            throw new InvalidEmailException("Email must have characters before '@'");
        }

        // 9. domain part cannot be empty
        if (domainPart.isEmpty()) {
            throw new InvalidEmailException("Email must have a domain after '@'");
        }

        // 10. domain must contain a dot
        if (!domainPart.contains(".")) {
            throw new InvalidEmailException("Email domain must contain '.'");
        }

        // 11. domain cannot start or end with a dot
        if (domainPart.startsWith(".") || domainPart.endsWith(".")) {
            throw new InvalidEmailException("Email domain cannot start or end with '.'");
        }

        // 12. no consecutive dots (like "ahmed..ali@gmail.com")
        if (email.contains("..")) {
            throw new InvalidEmailException("Email cannot contain consecutive dots");
        }

        // 13. minimum length
        if (email.length() < 5) {
            throw new InvalidEmailException("Email is too short");
        }

        // 14. maximum length
        if (email.length() > 254) {
            throw new InvalidEmailException("Email is too long");
        }

        // 15. domain extension must be at least 2 characters (e.g. .com, .eg)
        int lastDotIndex = domainPart.lastIndexOf('.');
        String extension = domainPart.substring(lastDotIndex + 1);
        if (extension.length() < 2) {
            throw new InvalidEmailException("Email domain extension is too short");
        }

        // 16. only allowed characters: letters, digits, dot, underscore, hyphen, @
        for (int i = 0; i < email.length(); i++) {
            char c = email.charAt(i);
            boolean isLetter = (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
            boolean isDigit = (c >= '0' && c <= '9');
            boolean isAllowedSymbol = (c == '.' || c == '_' || c == '-' || c == '@');

            if (!isLetter && !isDigit && !isAllowedSymbol) {
                throw new InvalidEmailException(
                        "Email contains invalid character: " + c
                );
            }
        }
    }
    }

