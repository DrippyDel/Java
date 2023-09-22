public class LinkedTail
{
  private Node head;
  private Node tail;

  public void tailInsertion(char data)
  {
    Node newNode = new Node(data);

    // Checks if list is empty
    if(head == null)
    {
      // if list is empty, both head and tail points to new node    
      head = newNode;
      tail = newNode;
    }
    else
    {
      // newNode will be added after tail such that tail's next will point to newNode
      tail.next = newNode;

      // newNode will become new tail of the printList
      tail = newNode;
    }
  }

  public void display()
  {
    // Node current will point to head
    Node current = head;

    if(head == null)
    {
      System.out.println("List is empty");
      return;
    }
    System.out.println("Adding nodes to the end of the list: ");
    while(current != null)
    {
      // Prints each node by incrementing pointer
      System.out.print(current.data + " ");
      current = current.next;
    }
    System.out.println();
  }

  public static void main(String[] args)
  {
    LinkedTail sList = new LinkedTail();

    sList.tailInsertion('d');
    sList.tailInsertion('e');
    sList.tailInsertion('l');

    sList.display();

  }
}
