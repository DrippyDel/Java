import java.util.Arrays;
public class Sandbox
{
  public static void main(String[] args)
     {
      practice(new String [] {"******","@@","+++"});
      //printChar();
     }

  public static void practice(String [] strings)
   {
     char [] line = new char[strings.length];
     int count = 0;
     int maxLength = 0;
     String longestString = null;

     for (String s : strings)
     {
       if (s.length() > maxLength)
       {
         maxLength = s.length();
         longestString = s;
       }
     }

     for (int i = 0; i < longestString.length();i++)
     {
       for(int j = 0; j < strings.length; j++)
       {
            if (i == strings[j].length())
            {
              strings[j] = strings[j].concat(" ");
            }
         line[j] = strings[j].charAt(i);
         System.out.println(count);
         count++;
       }
     }
     System.out.println("");
   }
   public static void printChar()
   {
     int [] spaceArray = new int []{2,2,2,3,4,5,5,5,4,3};
     System.out.println(spaceArray[0]);
   }
}

//One loop
//
// look for longest strings
// two for loops
// F

// This method will probably be easiest if you throw
// each line into a char
// array and only worry about eliminating any
// extra spaces from the end of the line of
// output after constructing that entire line. If you do use a char
// array, you might want to reset its contents
// using Arrays.fill() every time you start to construct a new line of output.
