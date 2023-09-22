// Delali Ekpeh
// COP3330 Spring 2023
// de770238

public class Garland
{
  // Reference to the top-left node in this garland.
  private Node head;
  // Reference to the top-right node in this garland.
  private Node tail;
  // The number of strings currently in this garland.
  private int size;

  Garland()
  {
  }

  Garland(String [] strings)
  {
    for (int i = 0; i < strings.length; i++)
    {
      addString(strings[i]);
    }
  }

  public Node head()
  {
    return head;
  }

  public int size()
  {
    return size;
  }

  public static void main(String [] args)
  {

  }

  public static Node stringToLinkedList(String s)
  {
    if (s == null || s.length() == 0)
    {
      return null;
    }

    Node head = null;
    Node tail = null;
    for (int i = 0; i < s.length(); i++)
    {
      Node newNode = new Node(s.charAt(i));
      // Checks if List is empty
      if (head == null)
      {
        tail = newNode;
        head = newNode;
      }
      else
      {
        // newNode will be added after tail
        tail.down = newNode;
        // newNode will become new tail
        tail = newNode;
      }
    }
    return head;
  }

  public static String linkedListToString(Node head)
  {
    Node current;
    current = head;
    int numNodes = 0;

    // Counts how many nodes were created
    while (current != null)
    {
      current = current.down;
      numNodes++;
    }

    current = head;
    char [] linkedChar = new char[numNodes];

    // Stores node data into char array
    for (int i = 0; i < linkedChar.length; i++)
    {
      linkedChar[i] = current.data;
      current = current.down;
    }
    String word = new String(linkedChar);

    return word;
  }

  public void addString(String s)
  {
    if (s == null || s.length() == 0)
    {
      return;
    }
    Node newNode = new Node(s.charAt(0));
    Node current = newNode;
    size++;

    if (head == null)
    {
      tail = newNode;
      head = newNode;
      current = newNode;
    }
    else
    {
      // newNode will be added after tail
      tail.next = newNode;
      // newNode will become new tail
      tail = newNode;
    }
    // builds the rest of the string with .down reference.
    for (int i = 1; i < s.length(); i++)
    {
      newNode = new Node(s.charAt(i));
        // adds char
        current.down = newNode;
        // points to the next char in string till
        current = newNode;
    }

  }

  public Node getNode(int index)
  {
    Node nextNode = head;
    Node current = null;

    if (index < 0 || index > (size - 1))
    {
      return null;
    }
    else
    {
      // Loops only to given index not whole Garland
      for (int i = 0; i <= index; i++)
      {
        // Saves the last node before null
        current = nextNode;
        nextNode = nextNode.next;
      }
      return current;
    }
  }

  public boolean removeString(int index)
  {
    Node current = head;
    Node prev = null;
    if (index < 0 || index > (size - 1))
    {
      return false;
    }
    else if (index == 0)
    {
      head = current.next;
      size--;
      return true;
    }
    else
    {
      // Finds the previous node of the node we want to delete
      current = getNode(index-1);

      // Keeps track of the node we want to delete
      prev = current;
      current = current.next;

      // Unlink the node from linked list
      prev.next = current.next;

      // Makes sure no pointer points to the deleted node
      current = null;

      size--;
      return true;
    }
  }

  public boolean printString(int index)
  {
    Node nextNode = head;
    int nodeIndex = 0;
    String [] Gar = new String[size()];

    if (index < 0 || index > (size - 1))
    {
      System.out.println("(invalid index)");
      return false;
    }
    else
    {
      // Loops .next
      while (nextNode != null)
      {
        String word = linkedListToString(nextNode);
        Gar[nodeIndex] = word;

        // Increments .next pointer
        nextNode = nextNode.next;
        nodeIndex++;
      }
      System.out.println(Gar[index]);
      return true;
    }
  }

  public void printStrings()
  {
    Node current = head;
    Node nextNode = head;

    if (head() == null)
    {
      System.out.println("(empty list)");
      return;
    }
    // Loops .next
    while (nextNode != null)
    {
      // Loops .down
      while (current != null)
      {
        // Prints each node by incrementing pointer
        System.out.print(current.data);
        current = current.down;
      }
      // Increments .next pointer
      nextNode = nextNode.next;
      current = nextNode;
      System.out.println();
    }
  }

  public String getString(int index)
  {
    Node nextNode = head;
    int nodeIndex = 0;
    String [] Gar = new String[size()];

    if (index < 0 || index > (size - 1))
    {
      return null;
    }
    else
    {
      // Loops .next
      while (nextNode != null)
      {
        String word = linkedListToString(nextNode);
        Gar[nodeIndex] = word;

        // Increments .next pointer
        nextNode = nextNode.next;
        nodeIndex++;
      }
      return Gar[index];
    }
  }

  public static double difficultyRating()
  {
    double rating = 4.6;
    return rating;
  }

  public static double hoursSpent()
  {
    double hours = 30;
    return hours;
  }
}
