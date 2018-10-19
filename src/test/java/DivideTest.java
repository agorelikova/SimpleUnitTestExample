import org.junit.Test;

/**
 * @author agorelikova
 * @since 31/08/2018
 */
public class DivideTest {
  @Test(expected = ArithmeticException.class)
  public void zeroDividerShouldThrowException() {
    Divide divide = new Divide();
    divide.divideTwoNumbers(4, 0);
  }
}
