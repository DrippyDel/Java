public class Practice7
// Hi, Bob: extra credit question
{
  // Big O- simplified analyysis of an algorithm's efficiency
  // Think worse case

  // General Rules
  // 1. Ignore constants 5n -> O(n)
  // Ex: 5n -> O(n)

  // 2. Certain terms "dominate" others
  // Ex: O(1) < O(log n) < O(n) < O(n log n) < O(n^2) < O(2^n) < O(n!)

  public static void main(String [] args)
  {
    int n = 10;

    for(int i = n/2; i <= n; i++)
    {
      System.out.println(i);
    }

    // Constant Runtime
    int x = 5 + (15 * 20); // O(1)
    // Total Runtime = O(1)

    // Linear Runtime
    for (int i = 0; i < n; i++) // n
    {
      System.out.println(i); // O(1)
    }
      // Total Runtime = n * O(1) = O(n)

    // Quadratic Runtime
    for (int i = 0; i < n; i++) // n
    {
      for (int j = 0; j < n; j++) // n
      {
        System.out.println(i * j); // O(1)
      }
    }
    // Total Runtime = n * n * O(1) = O(n^2)
  }

  public static int multi(int a, int b)
  {
    int prod = 0;

    if (b > a)
    {
      int temp = a;
      a = b;
      b = temp;
    }

    for (int i = 0; i < b; i++)
    {
      prod += a; // O(1)
    }
    return prod;
  }
  // Total Runtime = O(MIN(a,b))
  // If you read through the function the run time is
  // based on the value of b.

  public static String stringConcat(String s1, String s2)
  {
    // H e l l o -> 5 characters
    // C a r s   -> 4 characters
    // H e l l o C a r s -> 9 characters
    return s1 + s2;
  }
  // Total Runtime = O(s1 + s2) or O(m + n)
  // To concatenate two strings java has to
  // read s1 or (m) of characters + s2 or (n) of characters
}
