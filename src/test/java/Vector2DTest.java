import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author agorelikova
 * @since 30/08/2018
 */
public class Vector2DTest {

  private final double EPS= 1e-9;
  private static Vector2D v;

  @BeforeClass
    public static void createNewVector(){
     v = new Vector2D();
  }

  @Test
  public void newVectorShouldHaveZeroLength(){
    Assert.assertEquals(0,  v.vector2dLength(), EPS);
  }
  @Test
  public void newVectorShouldHaveZeroX(){
    Assert.assertEquals(0, v.getX(), EPS);
  }
  @Test
  public void newVectorShouldHaveZeroY(){
    Assert.assertEquals(0, v.getY(), EPS);
  }

  @Ignore
  @Test
  public void VectorShouldHavePositivResult4(){

    v.setX(4);
    v.setY(0);
    Assert.assertEquals(4, v.vector2dLength(), EPS);
  }

}
