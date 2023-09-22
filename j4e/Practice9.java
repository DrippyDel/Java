import java.util.ArrayList;

public class Practice9
{
  // ArrayList - a resizable array.
  // Elements can be added and removed after compilation phase.
  // Store reference data type.
  // Expand dynamically to accommodate new element.
  // Elements are stored contiguously in memory.

  // Array list Operations:
  // add(key) - 0(n) Adds key to end of ArrayList.
  // set(index, key) - 0(1) Set the element at given index to key
  // get(index) - O(1) Returns the element at given index
  // size() - Returns the number of elements in the ArrayList
  
  public static void main(String [] args)
  {
    ArrayList<String> food = new ArrayList<String>();

    // Adds to list
    food.add("Pizza");
    food.add("CheeseBurger");
    food.add("Fries");

    // Changes element at certain index
    food.set(0,"Burrito");

    // Removes an element at a certain index
    food.remove(2);

    // .size for ArrayList vs .length for Arrays
    for (int i = 0; i < food.size(); i++)
    {
      // .get for ArrayList vs charAt for Strings
      System.out.println(food.get(i));
    }
    // Clears the whole Array list
    food.clear();
  }
}
