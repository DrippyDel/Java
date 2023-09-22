// Delali Ekpeh
// COP3330 2023 Spring
// de770238

public class Bonfire
{
  public static boolean containsValueAfterIndex(int needle, int [] haystack, int index)
  {
    int x = 0;
    // Checks occurance of needle in haystack array at the given index
    for(int i = 0; i < haystack.length; i++)
    {
      if(index < 0)
      {
        index = index * -1;
      }
      if(index > (haystack.length - 1))
      {
        break;
      }
      if(haystack[index] == needle)
      {
        x = 0;
      }
      else //(haystack[index] != needle)
        x = 1;
    }
    if(x == 1)
      return true;
    else
      return false;
  }

  // Returns the third largest in the array
  public static int getThirdLargest(int [] array)
  {
    int firstLargest = array[0];
    int secondLargest = Integer.MIN_VALUE;
    int thirdLargest = Integer.MIN_VALUE;
    int firstLargestIndex = 0;
    int secondLargestIndex = 0;
    int thirdLargestIndex = 0;
    // Finds largest number in array
    for(int i = 0; i < array.length; i++)
    {
      if(array[i] > firstLargest)
      {
        firstLargest = array[i];
      }
      // Saves index of largest number
      else if(firstLargest == array[i])
      {
        firstLargestIndex = i;
      }
    }

    // Finds second largest number in array
    for(int i = 0; i < array.length; i++)
    {
      // Checks for second duplcate of largest number
      if(array[firstLargestIndex] == array[i] && i != firstLargestIndex)
      {
        secondLargestIndex = i;
        secondLargest = array[secondLargestIndex];
      }
      else if(array[i] > secondLargest && array[i] < firstLargest)
      {
        secondLargest = array[i];
      }
    }

    // Finds third largest number in array
    for(int i = 0; i < array.length; i++)
    {
      // Checks for third duplcate of largest number
      if(array[secondLargestIndex] == array[i] && i != firstLargestIndex && i != secondLargestIndex)
      {
        thirdLargestIndex = i;
        thirdLargest = array[thirdLargestIndex];
      }
      else if(array[i] > thirdLargest && array[i] < secondLargest)
      {
        thirdLargest = array[i];
      }
    }
    return thirdLargest;
  }

  public static void printThirdLargest(int [] array)
  {
    int firstLargest = array[0];
    int secondLargest = Integer.MIN_VALUE;
    int thirdLargest = Integer.MIN_VALUE;
    int firstLargestIndex = 0;
    int secondLargestIndex = 0;
    int thirdLargestIndex = 0;
    // Finds largest number in array
    for(int i = 0; i < array.length; i++)
    {
      if(array[i] > firstLargest)
      {
        firstLargest = array[i];
      }
      // Saves index of largest number
      else if(firstLargest == array[i])
      {
        firstLargestIndex = i;
      }
    }

    // Finds second largest number in array
    for(int i = 0; i < array.length; i++)
    {
      // Checks for second duplcate of largest number
      if(array[firstLargestIndex] == array[i] && i != firstLargestIndex)
      {
        secondLargestIndex = i;
        secondLargest = array[secondLargestIndex];
      }
      else if(array[i] > secondLargest && array[i] < firstLargest)
      {
        secondLargest = array[i];
      }
    }

    // Finds third largest number in array
    for(int i = 0; i < array.length; i++)
    {
      // Checks for third duplcate of largest number
      if(array[secondLargestIndex] == array[i] && i != firstLargestIndex && i != secondLargestIndex)
      {
        thirdLargestIndex = i;
        thirdLargest = array[thirdLargestIndex];
      }
      else if(array[i] > thirdLargest && array[i] < secondLargest)
      {
        thirdLargest = array[i];
      }
    }
    System.out.println(thirdLargest);
  }

  public static boolean isRotation(int [] array1, int [] array2)
  {
    int numFound = 0;
    int x = 0;
    // An array cannot be a rotation of another if they don't share the same amount of elements in them
    if(array1.length != array2.length)
    {
      return false;
    }
    // Two empty arrays are a rotation of each other
    if(array1.length == 0 && array2.length == 0)
    {
      return true;
    }
    // Checks if elements in array1 are found in array2
    for(int i = 0; i < array1.length; i++)
    {
      for(int j = 0; j < array2.length; j++)
      {
        if(array1[i] == array2[j])
        {
          // array1 = new int[] {5, 2, -4, 2};
      		// array2 = new int[] {5, -4, 2, 3};
          numFound = numFound + 1;
          if(numFound == array1.length)
          {
            return true;
          }
          else
            x = 0;
        }
      }
    }
    if(x == 1)
      return true;
    else
      return false;
  }
  public static int [] generateNthRotation(int [] array, int n)
  {
    if(n < 0)
    {
      n = n * -1;
    }
    
    int [] myArray = new int[(array.length)];
    // Changes positiong of index to the right based on how many n times
    for(int i = 0; i < array.length ; i++)
    {
      int rotation = ((i + n) % array.length);
      myArray[rotation] = array[i];

    }
    return myArray;
  }
    public static void printRibbon(int numberOfRows)
    {
      printBar(numberOfRows);
      System.out.print("|");
      for (int i=numberOfRows; i>=1; i--)
      {
        //Inner loop: Print spaces for each row
        for (int j=numberOfRows; j>i;j--)
        {
          System.out.print(" ");
        }
        //Inner loop: Print Stars for each row
        for (int k=1;k<=i;k++)
        {
          System.out.print("@");
        }
        //To move the cursor to new line for next row
        System.out.println();
      }
      printBar(numberOfRows);
    }

    	public static void printBar(int width)
    	{
    		System.out.print("+-");
    		printChar('-', width);
    		System.out.print("-+\n");
    	}

      public static void printChar(char ch, int n)
    	{
    		for (int i = 1; i <= n; i++)
    			System.out.print(ch);
    	}

        public static double difficultyRating()
        {
          double rating = 4;
          return rating;
        }

        public static double hoursSpent()
        {
          double hours = 20;
          return hours;
        }
}
