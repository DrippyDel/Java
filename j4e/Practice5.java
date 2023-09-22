public class Practice5
{
  private String name;
  private int adorablenessFactor;

  public static final boolean isAdorable = true;
  public static final String location = "Australia";

  public Quokka()
  {
  }

  public Quokka(String name, int howAdorable)
  {
    this.name = name;
    this.adorablenessFactor = howAdorable;
  }

  public void setName(String name)
  {
    // this shows that this variable is an instance
    // Strings in java are immutable
    this.name = name;
  }

  public String getName()
  {
    return this.name;
  }

  public void setAdorablenessFactor(int howAdorable)
  {
    this.adorablenessFactor = howAdorable;
  }

  public int getAdorablenessFactor()
  {
    return this.adorablenessFactor;
  }

  public static void main(String [] args)
  {
    Quokka q = new Quokka("Muffinface",5);

    System.out.println(q.name + " " + q.adorablenessFactor);

    String s1 = "lol";
    String s2 = "lol";

    // Use .equals to compare Strings
    if(s1.equals(s2))
    {
      System.out.println(s1 + " does equal " + s2);
    }

    // Since Stirngs are immutable
    // Java creates another string reference in memeory with the change
    s1 = s1.toUpperCase();
    System.out.println(s1);
  }
}
