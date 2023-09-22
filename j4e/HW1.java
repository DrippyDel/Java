/* COP 3503C Assignment 1
This Program is written by: Delali Ekpeh */

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.*;


public class HW1
{
  static Scanner in = new Scanner(System.in);

  public static void main(String [] args)
  {
    // First number of input is the amount of test cases
    int testCases = in.nextInt();
    printStuff(testCases);
    in.close();

  }

  public static void printStuff(int testCases)
  {

    int order = 0;
    int arraySize = 0;
    int innerData = 0;
    int target = 0;

      for (int i = 1; i <= testCases; i++)
      {
        // Gets whether array is sorted or not
        order = in.nextInt();
        //System.out.println("Order is : " + order);

        // Array is Sorted
        if (order == 1)
        {
          // The next number is the size of array
          arraySize = in.nextInt();

          // Takes game scores input and makes array out of them
          int [] sortedGameArray = new int [arraySize];

          for (int j = 0; j < arraySize; j++ )
          {
            innerData = in.nextInt();
            sortedGameArray[j] = innerData;

            //System.out.println("gameArray[" + j + "] = " + sortedGameArray[j]);
          }
          // The number of points in the game card
          target = in.nextInt();
          //System.out.println("Target is : " + target);

          int [] pairs = getCandidatePair(sortedGameArray,target);

          // If pair was found or not
          if (pairs.length == 0)
          {
            System.out.println("Test case#" + i + ":" + " Cannot finish your " + target + " points.");
          }

          else
          {
            System.out.println("Test case#" + i + ":" + " Play the games with " + pairs[0] + " points and " + pairs[1] + " points to finish your " + target + " points.");
          }

        }

        // Array is not sorted
        else
        {
          arraySize = in.nextInt();

          // int [] unsortedGameArray = new int [arraySize];

          ArrayList<Integer> unsortedGameArray = new ArrayList<Integer>();

          for (int k = 0; k < arraySize; k++)
          {
            innerData = in.nextInt();

            //unsortedGameArray[k] = innerData;
            unsortedGameArray.add(innerData);

            //System.out.println("unsortedgameArray[" + k + "] = " + innerData);
          }
          // The number of points in the game card
          target = in.nextInt();
          //System.out.println("Target is : " + target);

          Collections.sort(unsortedGameArray);

          // Using streams API of collections to convert to arry of primitive int type
          int [] arr = unsortedGameArray.stream().mapToInt(l -> l).toArray();

          int [] pair = getCandidatePair(arr, target);

          if (pair.length == 0)
          {
            System.out.println("Test case#" + i + ":" + " Cannot finish your " + target + " points.");
          }

          else
          {
            System.out.println("Test case#" + i + ":" + " Play the games with " + pair[0] + " points and " + pair[1] + " points to finish your " + target + " points.");
          }
      }
    }
  }

  public static int [] getCandidatePair(int A[], int target)
  {
      Map<Integer, Integer> map = new HashMap<>();

      int [] pairs = new int [2];
      int [] noPairs = {};

      for (int i = 0; i < A.length; i++)
      {
        // If the difference is seen before
        if (map.containsKey(target - A[i]))
        {
          pairs[0] = A[map.get(target - A[i])];
          pairs[1] = A[i];
          return pairs;
        }
        // Stores index of current element in the map
        map.put(A[i], i);
      }

      return noPairs;
  }
}
