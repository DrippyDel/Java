public class Generics
{
  // Generics - Enables types (classes and interfaces) to be parameters when:
  //            defining classes, interfaces and methods

  // Pro:
  // * Eliminates the need to create multiple versions of methods or classes for
  // various data types

  public static void main(String [] args)
  {
    Integer[] intArray = {1,2,3,4,5};
    Double[] doubleArray ={1.1,2.2,3.3,4.4,5.5};
    Character[] charArray ={'D','e','L','a','l','i'};
    String [] stringArray = {"One", "Two", "Selasi", "Four", "Five"};

    displayArray(intArray);
    displayArray(doubleArray);
    displayArray(charArray);
    displayArray(stringArray);

    System.out.println(getFirst(intArray));
    System.out.println(getFirst(doubleArray));
    System.out.println(getFirst(charArray));
    System.out.println(getFirst(stringArray));

    // Instance created from a generic class
    MyGenericClass<Integer> myInt = new MyGenericClass<>(8);
    System.out.println(myInt.getValue());

  }

// Thing takes anything passed to the method
  public static <Thing> void displayArray(Thing [] array)
  {
    for (Thing x : array)
    {
      System.out.print(x+" ");
    }
    System.out.println();
  }

  // Returns generic value
  public static <Thing> Thing getFirst(Thing [] array)
  {
    return array[0];
  }
}
// Generic class
class MyGenericClass <Thing>
{
  Thing x;
  MyGenericClass(Thing x)
  {
    this.x = x;
  }

  public Thing getValue()
  {
    return x;
  }
}
