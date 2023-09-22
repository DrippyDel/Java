import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Lab1
{
  static Scanner in = new Scanner(System.in);

//  Scanner in = new Scanner(System.in);

  public static void main(String [] args)
  {
    // Takes input from terminal
     //Scanner in = new Scanner(System.in);
    //System.out.println("Enter the total numbers to be inputed: ");
    int n = in.nextInt();

    printMedian(n);
    in.close();
  }


  public static void printMedian(int n)
  {
    // Max Heap
    PriorityQueue<Integer> leftHalf = new PriorityQueue<>(Collections.reverseOrder());

    // Min Heap
    PriorityQueue<Integer> rightHalf = new PriorityQueue<>();

    // Scanner in = new Scanner(System.in);
    int data = in.nextInt();
    double median = (double) data;

    System.out.println(median);
    leftHalf.add(data);

    for (int i = 1; i < n; i++)
    {
      data = in.nextInt();

      // check for the size of the heaps and
      // determine which heap to insert data into

      // Size of Max heap is greater than the size of Min heap
      if (leftHalf.size() > rightHalf.size())
      {
        // Element is less than the previous median
        if (data < median)
        {
          // Peek top element from max heap and insert into min heap.
          rightHalf.add(leftHalf.poll());
          // Insert new element to max heap
          leftHalf.add(data);


          median = (double)(leftHalf.peek() + rightHalf.peek()) / 2;
        }
        // Insert new element to min heap
        else
        {
          rightHalf.add(data);
        }
          median = (double)(leftHalf.peek() + rightHalf.peek()) / 2;
      }

      // If the size of both heaps are the same
      else if (leftHalf.size() == rightHalf.size())
      {
         //System.out.println("Here");
        // If element is less than previous median
          if (data < median)
          {
            // Insert element to max heap
            leftHalf.add(data);
            // New median is now equal to the top of max heap
            median = leftHalf.peek();
          }

          // If element is greater than previous median
          else
          {
            // Insert element to min heap
            rightHalf.add(data);
            // New median is now equal to the top of min heap
            median = rightHalf.peek();
          }
        //  System.out.println("Max heap top is: " + leftHalf.peek() + " Min heap top is: " + rightHalf.peek());

      }

      // If size of Max heap is less than the size of Min heap
      // if (leftHalf.size() < rightHalf.size())
      else
      {
        // Element is greater than the previous median
        if (data > median)
        {
          //System.out.println("Max heap top is: " + leftHalf.peek() + " Min heap top is: " + rightHalf.peek());

          // Peek top element from Min heap and insert into Max heap.
          leftHalf.add(rightHalf.poll());
          // Insert new element to Min heap
          rightHalf.add(data);
          //System.out.println("Max heap top is: " + leftHalf.peek() + " Min heap top is: " + rightHalf.peek());
          median = (double)(leftHalf.peek() + rightHalf.peek()) / 2;
        }

        // If element is less than previous mean
        else
        {
          // Insert element to Max heap
          leftHalf.add(data);
        }
        median = (double)(leftHalf.peek() + rightHalf.peek()) / 2;
      }
      System.out.println(median);
    }
  }

}
