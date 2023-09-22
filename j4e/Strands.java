// Delali Ekpeh
// COP3330 Spring 2023
// de770238

import java.util.Arrays;
public class Strands
{
  // O(k), k being str length
  // prints each character
  // in a string vertically
  public static void straightAndNarrow(String str)
  {
    if (str == null)
    {
      System.out.println("Pshh!");
    }
    else
    {
      for (int i = 0; i < str.length(); i++)
      {
        System.out.println(" " + " " + str.charAt(i));
      }
      System.out.println();
    }
  }

  // O(k * n), k being str length
  // prints each character in
  // a string vertically with
  // n amount of space preceding
  public static void straightAndNarrow(String str,int n)
  {
    if (str == null)
    {
      System.out.println("Pshh!");
    }
    else
    {
      for (int i = 0; i < str.length(); i++)
      {
        for (int j = 0; j < n; j++)
        {
          System.out.print(" ");
        }
        printChar(str,i);
      }
      System.out.println();
    }
  }

  // O(k), k being str length
  // prints string characters
  // in a wavy path pattern
  public static void meanderingPath(String str)
  {
    if (str == null)
    {
      System.out.println("Error" + str + " is null");
    }
    else
    {
      // Keeps track of where pattern is compared to string index
      int count = 0;
      for (int i = 0; i < str.length(); i++)
      {
        if (i == 0)
        {
          printSpace(count,i);
          printChar(str,i);
        }
        else if (count == 0 && i != 0)
        {
          printSpace(count,i);
          printChar(str,i);
        }
        else if (count == 1)
        {
          printSpace(count,i);
          printChar(str,i);
        }
        else if (count == 2)
        {
          printSpace(count,i);
          printChar(str,i);
        }
        else if (count == 3)
        {
          printSpace(count,i);
          printChar(str,i);
        }
        else if (count == 4)
        {
          printSpace(count,i);
          printChar(str,i);
        }
        else if (count == 5)
        {
          printSpace(count,i);
          printChar(str,i);
        }
        else if (count == 6)
        {
          printSpace(count,i);
          printChar(str,i);
        }
        else if (count == 7)
        {
          printSpace(count,i);
          printChar(str,i);
        }
        else if (count == 8)
        {
          printSpace(count,i);
          printChar(str,i);
        }
        else if (count == 9)
        {
          printSpace(count,i);
          printChar(str,i);
          count = -1;
        }
        count++;
      }
    }
    System.out.println();
  }

  public static void classicRapunzel(String [] strings)
  {
     //char [] line = new char[strings.length];
     int count = 0;
     int count2 = 0;
     int count3 = 0;
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
       char [] line = new char[strings.length];
       for(int j = 0; j < strings.length; j++)
       {
            if (i == strings[j].length())
            {
              strings[j] = strings[j].concat(" ");
            }
         line[j] = strings[j].charAt(i);
         // else { " "}
          printLine(line[j],strings,count,count3);
         if (j == strings.length - 1)
         {
           //System.out.println(count);
           System.out.println("");
         }
         // Pattern resets when gets to the end
         if (count2 == 9)
         {
           count = -1;
         }
         // Counts each character
         count++;
         // To check first line
         count3++;
       }
       // Keeps track where line is to the pattern
       count2++;
     }
     System.out.println("");
  }

  public static void steamyMocha(String [] strings)
  {
    char [] line = new char[strings.length];
    int count = 0;
    int count2 = 0;
    int count3 = 0;
    int maxLength = 0;
    String longestString = null;

    // Adds empty space at the start of all odd elements of the array
    for (int i = 0; i < strings.length; i++)
    {
      if (i % 2 == 0)
      {

      }
      else
      {
        strings[i] = " " + strings[i];
      }
    }

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
         printLine(line[j],strings,count,count3);
        if (j == strings.length - 1)
        {
          //System.out.println(count);
          System.out.println("");
        }
        // Pattern resets when gets to the end
        if (count2 == 9)
        {
          count = -1;
        }
        // Counts each character
        count++;
        // To check first line
        count3++;
      }
      // Keeps track where line is to the pattern
      count2++;
    }
    System.out.println("");
  }

  public static void cascadingWaterfall(String [] strings)
  {
    char [] line = new char[strings.length];
    int count = 0;
    int count2 = 0;
    int count3 = 0;
    int count4 = 1;
    int maxLength = 0;
    String longestString = null;

    // Empty space added for index amount for Each array element
    for (int i = 0; i < strings.length; i++)
    {
      if(i < strings.length && i != 0)
      {
        strings[i] = printSpace(i) + strings[i];
      }
    }

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
        printLine(line[j],strings,count,count3);
        if (j == strings.length - 1)
        {
          //System.out.println(count);
          System.out.println("");
        }
        // Pattern resets when gets to the end
        if (count2 == 9)
        {
          count = -1;
        }
        // Counts each character
        count++;
        // To check first line
        count3++;
      }
      // Keeps track where line is to the pattern
      count2++;
    }
    System.out.println("");
  }

  public static void printChar(String str, int n)
  {
    System.out.println(str.trim().charAt(n));
  }

  public static String printSpace(int n)
  {
    String space = " ";

    for (int i = 1; i < n; i++)
    {
      space = " " + space;
    }
    return space;
  }

  public static void printSpace(int n, int i)
  {
      if (n == 3 || i == 0 || n == 9)
      {
        System.out.print(" " + " " + " ");
      }
      else if (n == 1 || n == 2 || n == 0)
      {
        System.out.print(" " + " ");
      }
      else if (n == 4 || n == 8)
      {
        System.out.print(" " + " " + " " + " ");
      }
      else if (n == 5 || n == 6 || n == 7)
      {
        System.out.print(" " + " " + " " + " " + " ");
      }
  }

  public static void printLine(char character,String [] strings, int count, int count3)
  {
      // index 0, 3, & 9 first char
      if (count3 == 0 || count == (strings.length * 3) || count == (strings.length * 9))
      {
        System.out.print(" " + " " + " " +  character);
      }
      // index 0 full line
      else if(count < strings.length)
      {
        System.out.print(" " + " " + character);
      }

      // index 1 & 2 first char
      else if(count == strings.length || count == (strings.length * 2))
      {
        System.out.print(" " + " " + character);
      }
      // index 1 & 2 full line
      else if (count < (strings.length * 2))
      {
        System.out.print(" " + " " + character);
      }

      // index 3 full line
      else if (count < (strings.length * 4)) // index 3
      {
        System.out.print(" " + " " + character);
      }

      // index 4 & 8 first char
      else if(count == (strings.length * 4) || count == (strings.length * 8))
      {
         System.out.print(" " + " " + " " + " " + character);
      }
      // index 4 full line
      else if (count < (strings.length * 5))
      {
        System.out.print(" " + " " + character);
      }

      // index 5,6 & 7 first char
      else if(count == (strings.length * 5)|| count == (strings.length * 6) || count == (strings.length * 7))
      {
         System.out.print(" " + " " + " " + " " + " " + character);
      }
      // index 5 full line
      else if (count < (strings.length * 6))
      {
        System.out.print(" " + " " + character);
      }

      // index 6 full line
      else if (count < (strings.length * 7))
      {
        System.out.print(" " + " " + character);
      }

      // index 7 full line
      else if (count < (strings.length * 8))
      {
        System.out.print(" " + " " + character);
      }

      // index 8 full line
      else if (count < (strings.length * 9))
      {
        System.out.print(" " + " " + character);
      }

      // index 9 full line
      else if (count < (strings.length * 10))
      {
        System.out.print(" " + " " + character);
      }
  }
}
