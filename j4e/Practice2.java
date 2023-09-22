import java.util.Arrays;
ß// Arrays and Constants
public class Practice2
{
  // Arrays are fixed in size
  // Cells are contigous in memory

  // Pros:
  // We have O(1) access to the kth element (array[i])

  // Cons:
  // They can get too large (wasted space) or too small (not enough space)
  // Doesn't grow dynmically
  // To add i to othe array it's a O(n)

  public static void main(String [] args)
  {
    // Calls Practice1.Java file and then calls the smile method inside the file.
    Practice1.smile();

    // Data type, [bracket], variable name, new datatype and [array size]
    int [] myArray = new int[10];

    // Prints the address of the array. In java address is called reference.
    System.out.println(myArray);

    for(int i = 0; i < myArray.length; i++)
    {
      myArray[i] = i;
      System.out.println(myArray[i]);
    }

    //Prints array in array format: [0, 1, 2 ]
    System.out.println(Arrays.toString(myArray));

    int [] otherArray = Arrays.copyOf(myArray,myArray.length);
    System.out.println(otherArray);

    for(int i = 0; i < otherArray.length; i++)
    {
      System.out.println(otherArray[i]);
    }

    System.out.println("The biggest number in the array is " + getMax(otherArray));
  }

  // Constants: final makes the variable a constants
  // Static means same
  // Non-static variable in a method -> non static methods
  // Static method -> only contains static varibales
  // Java would give zeros to Class variables Ex: publie int x would be zero

  //Fields
  private String name;
  int currentSpeed;

  public static final int CAT1_MIN_SPEED = 74;
  public static final int CAT1_MAX_SPEED = 95;

  public static final int CAT2_MIN_SPEED = 96;
  public static final int CAT2_MAX_SPEED = 110;

  public static final int CAT3_MIN_SPEED = 111;
  public static final int CAT3_MAX_SPEED = 150;

  //Setter
  public void setName(String newName)
  {
    if (newName.contains("doom"))
    {
      name = "(unnamed)";
    }
    else
    {
      name = newName;
    }
  }

  //Getter
  public String getName()
  {
    return name;
  }

  public void printInfo()
  {
    System.out.println("Hurricane Name: " + name);
    System.out.println("Current Speed: " + currentSpeed + " mph");
    System.out.println();
  }

  public static void printCategory(int mph)
  {
    if(mph < CAT1_MIN_SPEED)
    {
      System.out.println("Not a hurricane");
    }
    else if(mph < CAT2_MIN_SPEED)
    {
      System.out.println("Category 1!");
    }
    else if(mph < CAT3_MIN_SPEED)
    {
        System.out.println("Category 2!");
    }
  }
}
