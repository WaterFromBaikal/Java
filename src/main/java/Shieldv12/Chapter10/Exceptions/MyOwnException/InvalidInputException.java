package Shieldv12.Chapter10.Exceptions.MyOwnException;

public class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}
