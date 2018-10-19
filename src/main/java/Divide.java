/**
 * @author agorelikova
 * @since 31/08/2018
 */
public class Divide {
  private int number1;
  private int number2;
  public double divideTwoNumbers(int number1, int number2){
    if (number2==0)
    {throw new ArithmeticException("Деление на ноль не определено");}
    return  number1/number2;
  }

  public int getNumber2() {
    return number2;
  }

  public void setNumber2(int number2) {
    this.number2 = number2;
  }

  public int getNumber1() {
    return number1;
  }

  public void setNumber1(int number1) {
    this.number1 = number1;
  }
}
