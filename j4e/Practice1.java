public class Practice1 // Class names must be capitalized and the same as file name
{
  // Identifier: Varibale names, class names, method names
  // Keywords: stuff that's build in to the syntax of the language Ex: int, public, class, static, void, return

  public static void main(String [] args)
  {
    int i = 50; // Ints uses 32 bits of memory in Java
    float x = -3.8f; // Float uses 32 bits of memory in Java
    double y = 1.24; // Double uses 64 bits of memory in Java
    char word ='Z'; // Char uses 16 bits of memory in Java
    boolean b1 = true;

    // System in System.out.println is a class hint the capitalization
    System.out.println("Hello world! " + i);
    System.out.println("Float: " + x);
    System.out.println("Double: " + y);
    System.out.println("Char: " + word);
    System.out.println("Boolean: " + b1);


    smile(); // Calls the smile class
    System.out.println("x: " + getSmallestInteger()); // Calls class inside print function
  //  System.out.println("y: " + getMax();
  }

  // smile method
  public static void smile() // <-- void cannot be a parameter !!
  {
    System.out.println(" :) ");
  }

  public static int getSmallestInteger()
  {
    // Integerover Flow: When java reaches the highest or lowset number (2147483647 or -2147483648)
    // Java would loop to the opposite value and add or minus one to it.
    int x = 0;
    while(x >= 0)
    {
      x++;
    }
    return x;
  }

    public static int getMax(int [] array)
    {
      int max = Integer.MIN_VALUE; // -2147483648 the lowset number

      for (int i = 0; i < array.length; i++)
      {
        if(array[i] > max)
        {
          max = array[i];
        }
      }
      return max;
    }
}
