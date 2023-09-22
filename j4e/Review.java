public class Review
{
  // Creates a class attribute
  int x;

  // Class Constructor for Review class
  // A Constructor in java is a special method used to initialize objects
  // REVIEW Constructors !!
  public Review()
  {
    x = 5;
  }

  public static void main(String [] args)
  {
    // Create an object of class Review (This will call the constructor)
    Review example = new Review();
    System.out.println(example.x);
  }

  public class Person
  {
    // Fields in Person Class
    private int ssn;
    private String name;


    Person(String name)
    {
      this.name = name;
    }

    // Setter Needed since name field is private
    public void setName(String newName)
    {
      if(name.contains("doom"))
      {
        name = "Hope";
      }
      else
      {
        this.name = newName;
      }
    }

    // Getter Needed since name field is private
    public String getName()
    {
      return name;
    }
  }

  // From quiz 4 question3 the refercence of trink3 would be unknown (to what we were given on the quiz)
  // Since the varable trink would have the refercence not trink1
  // trink3 = cloneTrinket(trink1);

  // public static Trinket cloneTrinket(Trinket prototype)
  // {
  //   Trinket trink = new Trinket();
  //   String newLabel = prototype.getLabel():
  //   trink.setLabel(newLabel);
  //   newLabel = null;
  //
  //   return trink;
  // }
}
