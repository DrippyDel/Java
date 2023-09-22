class Strand
{
   public static void main(String [] args)
   {

   }
   public String toString()
   {
      return "strandy-strand!";
   }

   public void disentangle(Strand s)
   {
      System.out.println("- " + s);
   }

   public void disentangle(Yarn y)
   {
      System.out.println("- " + y);
   }
}

class Yarn extends Strand
{
   public String toString()
   {
      return "yarny-yarn!";
   }

   public void disentangle(Strand s)
   {
      System.out.println("~ " + s);
   }

   public void disentangle(Yarn y)
   {
      System.out.println("~ " + y);
   }
}

class Twine extends Yarn
{
   public String toString()
   {
      return "twiney-twine!";
   }

   public void disentangle(Strand s)
   {
      System.out.println("= " + s);
   }

   public void disentangle(Yarn y)
   {
      System.out.println("= " + y);
   }

   public static void main(String [] args)
   {
     Strand tangle = new Strand();
     tangle.disentangle(tangle);
   }
}
