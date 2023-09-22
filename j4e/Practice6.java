public class Practice6
{
  // Char bits go from 0 - 65535 (2^16 - 1 (includes 0))
  // So any integer greater would result in error since there's
  // no char value thats exist pass 65535

  // method overloading (ploymerishism) the method five
  public static int five(int n)
  {
    System.out.println("Inty");
    return 5;
  }

  public static double five(double n)
  {
    System.out.println("Dubby");
    return 5.0;
  }

  public static void main(String [] args)
  {
    // five method is returing a double
    // and you can't downgrade a double to a int
    int x = (int)five(5.0);
    System.out.println(x);

    // five method is returning a int
    // but you can upgrade a int to double.
    double y = five(5);
    System.out.println(y);
  }
}
