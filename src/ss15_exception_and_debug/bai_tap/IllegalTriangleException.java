package ss15_exception_and_debug.bai_tap;

public class IllegalTriangleException extends RuntimeException {
  public IllegalTriangleException(String message) {
    super(message);
  }
}
