import org.junit.Assert;
import org.junit.Test;

/**
 * @author agorelikova
 * @since 31/08/2018
 */
public class SqureRootTest {
  @Test (expected = ArithmeticException.class)
  public void negativNumberShouldReturnThrowException(){
    SqureRoot squreRoot = new SqureRoot();
    squreRoot.sqroot(-5);
  }
  @Test
  public void squreRootBy16ShouldBe4(){
    SqureRoot squreRoot = new SqureRoot();
    Assert.assertEquals(4,squreRoot.sqroot(16),1e-2);
  }
}
