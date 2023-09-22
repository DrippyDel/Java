public class LinkedList
{
  // Head of list
  private Node head;

  // Method to insert a new Node
  public static LinkedList insert(LinkedList list, char data)
  {
    // Creates a new node with given data
    Node new_node = new Node(data);

    // If the linked list is empty,
    // the new node becomes head
    if (list.head == null)
    {
      list.head = new_node;
    }
    // else traverse till the last node
    // and insert the new_node there
    else
    {
      Node last = list.head;
      // Loops till end of LinkedList
      while(last.next != null)
      {
        last = last.next;
      }
      // Insert the new_node at last node
      last.next = new_node;
    }
    // return the list by head
    return list;
  }

  // Method to print the LinkedList
  public static void printList(LinkedList list)
  {
    Node currNode = list.head;
    System.out.println("Linkedlist: ");

    // Traverse through the LinkedList
    while (currNode != null)
    {
      // Print current node
      System.out.println(currNode.data);

      // Go to next node
      currNode = currNode.next;
    }
  }

  public static void main(String [] args)
  {
    // Start with empty list
    LinkedList list = new LinkedList();

    // Insertion
    list = insert(list,'d');
    list = insert(list,'e');
    list = insert(list,'l');

    printList(list);
  }

}
