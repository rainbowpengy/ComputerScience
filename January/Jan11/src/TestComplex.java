/**
 * This is a test class for the Complex number class
 * @author Jarod Klion
 */

public class TestComplex
{
  public static void testConstructors()
  {
    Complex c1 = new Complex();
    Complex c2 = new Complex(7);
    Complex c3 = new Complex(12, -20);
    Complex c4 = new Complex(12, -20);

    System.out.println("c1 = " + c1);
    System.out.println("c2 = " + c2);
    System.out.println("c3 = " + c3);
    System.out.println("c4 = " + c4);
    System.out.println();
  }

  public static void testArithmetic()
  {
    Complex c1 = new Complex(1, 2);
    Complex c2 = new Complex(1, 3);

    Complex sum = c1.add(c2);
    System.out.println("(" + c1 + ")" + " + " + "(" + c2 + ")" +  " = " + sum);

    Complex product = c1.multiply(c2);
    System.out.println("(" + c1 + ")" + " * " + "(" + c2 + ")" + " = " + product);

    Complex product2 = c1.multiply(2);
    System.out.println("(" + c1 + ")" + " * " + "2i" + " = " + product2);

    //show step to get abs value
    //+ c1.getReal() + "^2 " + "+" + c1.getComplex() + "^2" + " = "
    System.out.println("Absolute value of " + "(" + c1 + ")" + " = " + c1.abs());

    System.out.println();
  }

  public static void testValues()
  {
    Complex c = new Complex(2, 3);
    System.out.println("(" + c + ")" + " = " + c.getReal());
    System.out.println("(" + c + ")" + " = " + c.getComplex() + "i");
    System.out.println();
  }

  public static void main(String[] args)
  {
    testConstructors();
    testArithmetic();
    testValues();
  }
}
