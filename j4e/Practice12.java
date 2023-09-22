public class Practice12
{
  // The Wrapper class
  // Wrapper examples: Integer, Float, Double, String,  & Character
  // Primatives examples: int, float, double, char

  // Wrapper classes takes more memory than Primatives
  public static void main(String [] args)
  {
    // i holds the value 7
    int i = 7;
    // j holds the address that points to the value 8;
    Integer j = 8;
    Integer d = 100;

    // Autounboxing - java would still return the value 8
    //                despite j being the address of 8
    i = j;

    if (d instanceof Integer)
      System.out.println(d + " is a instance of Integer class");
    else
      System.out.println(d + " is not a instance of Integer class");

  }

// Practical use of a Wrapper class:
// Since Wrapper classes are addresses it can become null
  public static Integer findMax(int [] arr)
  {
    if (arr.length == 0)
    {
      return null;
    }

      int max  = Integer.MIN_VALUE;
      for (int i = 0; i < arr.length; i++)
        if(arr[i] > max)
          max = arr[i];

      return max;
  }
}
