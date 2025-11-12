package lesson10;

public class CustomException extends RuntimeException {

    private final String message;


    public CustomException(String message,Throwable cause) {
        super(message,cause);
        this.message = message;
    }
    public CustomException(String message) {
        this.message = message;
    }


    public String getMessage() {
        return message;
    }

}
