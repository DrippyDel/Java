public class Vehicle
{
  double speed;
  public String name;
  public int doors;
  public int wheels;

  public void go()
  {
    System.out.println("This vehicle is moving");
  }

  public void stop()
  {
    System.out.println("This vehicle is stopped");
  }

  public void info()
  {
    System.out.println("The " + name + " has " + doors + " doors and " + wheels + " wheels");
  }
}
