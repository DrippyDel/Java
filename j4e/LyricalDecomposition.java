// Delali Ekpeh
// COP3330 Spring 2023
// de770238

public class LyricalDecomposition
{
  public static void main(String [] args)
  {
    // Prints full There was an old lady who swallowed a fly poem
    printLyrics();
    difficultyRating();
    hoursSpent();
  }

  public static void printLyrics()
  {
    printVerseI();
    printVerseII();
    printVerseIII();
    printVerseIV();
    printVerseV();
    printVerseVI();
  }

  public static void printVerseI()
  {
    System.out.print("There was an old woman who swallowed a fly.\n");
    printIDK();
  }

  public static void printVerseII()
  {
    System.out.println("There was an old woman who swallowed a spider,");
    System.out.println("That wriggled and iggled and jiggled inside her!");
    printSwallowedSpider();
    printIDK();
  }

  public static void printVerseIII()
  {
    System.out.println("There was an old woman who swallowed a bird.");
    System.out.println("How absurd, to swallow a bird!");
    printSwallowedBird();
    printSwallowedSpider();
    printIDK();
  }

  public static void printVerseIV()
  {
    System.out.println("There was an old woman who swallowed a cat.");
    System.out.println("Imagine that, to swallow a cat!");
    printSwallowedCat();
    printSwallowedBird();
    printSwallowedSpider();
    printIDK();
  }

  public static void printVerseV()
  {
    System.out.println("There was an old woman who swallowed a dog.");
    System.out.println("What a hog, to swallow a dog!");
    printSwallowedDog();
    printSwallowedCat();
    printSwallowedBird();
    printSwallowedSpider();
    printIDK();
  }
  public static void printVerseVI()
  {
    System.out.println("There was an old woman who swallowed a horse.");
    System.out.println("She died, of course!");
  }

  public static void printSwallowedDog()
  {
    System.out.println("She swallowed the dog to catch the cat;");
  }

  public static void printSwallowedCat()
  {
    System.out.println("She swallowed the cat to catch the bird;");
  }

  public static void printSwallowedBird()
  {
    System.out.println("She swallowed the bird to catch the spider;");
  }

  public static void printSwallowedSpider()
  {
    System.out.println("She swallowed the spider to catch the fly.");
  }

  public static void printIDK()
  {
    System.out.println("I don't know why she swallowed that fly;");
    System.out.println("Perhaps she'll die.\n");
  }

  public static double difficultyRating()
  {
    double rating = 3;
    return rating;
  }

  public static double hoursSpent()
  {
    double hours = 3;
    return hours;
  }
}
