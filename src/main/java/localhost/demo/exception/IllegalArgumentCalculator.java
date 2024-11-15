package localhost.demo.exception;

public class IllegalArgumentCalculator extends RuntimeException {
    public IllegalArgumentCalculator(String message) {
        super(message);
    }
}
