public class Practice3

// +---------+
// |    *    |
// |   ***   |
// |  *****  |
// | ******* |
// |  *****  |
// |   ***   |
// |    *    |
// +---------+

{
  public static void main(String [] args)
  {
    if (args.length < 1) // Takes input from command line when program runs
    {                    // Ex: java Practice3 5 or some number
      System.out.println("Proper syntax: java Diamond <n>");
      return;
    }

    int width = Integer.parseInt(args[0]);
    printDiamond(width);
  }

  	public static void printChar(char ch, int n)
  	{
  		for (int i = 1; i <= n; i++)
  			System.out.print(ch);
  	}

  	public static void printLine(int width, int numStars)
  	{
  		int numSpaces = (width - numStars) / 2;

  		System.out.print("| ");

  		printChar(' ', numSpaces);
  		printChar('*', numStars);
  		printChar(' ', numSpaces);

  		System.out.print(" |");

  		System.out.print("\n");
  	}

  	public static void printBar(int width)
  	{
  		System.out.print("+-");
  		printChar('-', width);
  		System.out.print("-+");

  		System.out.print("\n");
  	}

  	public static void printDiamond(int width)
  	{
  		if (width % 2 == 0 || width <= 0) // Make sure that the width is not even
  			return;

  		printBar(width);

  		for (int numStars = 1; numStars <= width; numStars += 2)
  			printLine(width, numStars);

  		for (int numStars = width - 2; numStars >= 1; numStars -= 2)
  			printLine(width, numStars);

  		printBar(width);
  	}
}
