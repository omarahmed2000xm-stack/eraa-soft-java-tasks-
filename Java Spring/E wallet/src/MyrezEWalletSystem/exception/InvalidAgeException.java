package MyrezEWalletSystem.exception;

public class InvalidAgeException extends Exception{
    InvalidAgeException(){
        super("Age must be more than 18");
    }
}
