/**
 * @author agorelikova
 * @since 30/08/2018
 */
public class Vector2D {
  private double x;
  private double y;

  public double getX() {
    return x;
  }

  public void setX(double x) {
    this.x = x;
  }

  public double getY() {
    return y;
  }

  public void setY(double y) {
    this.y = y;
  }
  public double vector2dLength(){
    return Math.sqrt(x * x + y * y);
  }
}
