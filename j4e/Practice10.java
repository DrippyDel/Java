public class Practice10
{
  // Inheritance - the process where one class acquires,
  //               the attributes and metods of another.
  // Private fields are not inherited
  // Check Car.java for Method overriding notes 

  public static void main(String [] args)
  {
    // Since the Car class inherits the Vehicle class,
    // the Car class receives everything that the Vehicle class has
    Car honda = new Car("honda");
    //honda.name = "Civic Si Sedan";
    honda.doors = 4;
    honda.wheels = 4;

    System.out.println(honda.speed);
    System.out.println(honda.doors);
    System.out.println(honda.wheels);
    honda.info();
  }

  // The following code would be in it's own file

  // All other classes would inherit from Vehicle class
  // Parent class
  // public class Vehicle
  // {
  //   double speed;
  //
  //   void go()
  //   {
  //     System.out.println("This vehicle is moving");
  //   }
  //
  //   void stop()
  //   {
  //     System.out.println("This vehicle is stopped");
  //   }
  // }

  // Now the Car class is a subclass of the Vehicle class
  // Child class

  // public class Car extends Vehicle
  // {
  //
  // }

  // Now the Sedan class is a subclass of the Car class,
  // which is also a subclass of the Vehicle class

  // public class Sedan extends Car
  //   {
  //
  //   }
}
