import org.junit.Test;

/**
 * @author agorelikova
 * @since 31/08/2018
 */
public class NetworkConnectionTest {
  @Test(timeout = 1000)
  public void connectionShouldBeFasterThanSecond(){
    NetworkConnection.getConnection();
  }
}
