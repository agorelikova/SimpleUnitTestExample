/**
 * @author agorelikova
 * @since 31/08/2018
 */
public class SqureRoot {
  private int num;
  public double sqroot(int num){
    if (num<0){throw new ArithmeticException("Квадратный корень из отрицательного числа не определен");}
    return Math.sqrt(num);
  }
}
