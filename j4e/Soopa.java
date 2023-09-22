class Subby extends Soopa
{
   public  void foo()
   {
      System.out.print("subby");
   }
}

public class Soopa
{
   public  void foo()
   {
      System.out.print("soopa");
   }

   public static void doThing(Soopa thing)
   {
      thing.foo();
      System.out.println();
   }

   public static void main(String [] args)
   {
       Subby thing = new Soopa();

      // Output format: xxxxx-yyyyy

      thing.foo();
      System.out.print("-");
      doThing(thing);
   }
}
