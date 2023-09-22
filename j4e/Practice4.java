public class Practice4
{

  public static void main(String [] args)
  {
    // printCharacters();

    // Instantiating a class
    // Creating an instance of this class
    // We're creating a hurricane object from the Practice2 class
    // an object is an instance of a class
    // hurricane1 is a reference to a hurricane object in the Practice2 Class
    Practice2 hurricane1 = new Practice2();
    // Defualt Constuctors
    Practice2 hurricane2 = new Practice2();

    Practice2.printCategory(100);
    hurricane1.printCategory(10);

    hurricane1.setName("Delali");
    hurricane1.currentSpeed = 10;

    hurricane2.setName("doom");
    hurricane2.currentSpeed = 100;

    System.out.println(hurricane1.getName());
    System.out.println(hurricane2.getName());

    System.out.println("--------------------");
    hurricane1.printInfo();
    hurricane2.printInfo();
  }

  // Characters in Java
  public static void printCharacters()
  {
    for (char ch = 'a'; ch <= 'z'; ch++) // Uses ASCII key value
    {
      System.out.println(ch + " " + (int)ch); // Typecasting ch to an int
    }
    System.out.println((int)(Math.random() * 10)); // Goes 0 - 9
  }

  public static int loopyLoop()
  {
    int i = -1000000;

    while (i < 0)
    {
      if (i < 0)
        i--;
      if (i > 0)
        return 1;
    }
    return 0;
  }
}
