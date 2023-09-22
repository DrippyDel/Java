public class Practice8
{
  // Link List
  // O(n)
  // Head: The first node of a link list
  // Tail: The last node of a link list
  // Expand and shrink dynamically as we add and remove elements

 private Node head;

 public void print()
 {
  if(head == null)
  {
    System.out.println("\n (empty list) \n");
    return;
  }
  // For format
  System.out.print("\n  ");

  // This for loop goes through each node in the list. We use the
  // conditional operator (?:) to determine whether to print a space after
  // each element or a newline character. We only print a newline
  // character after the last element in the list. Other than that, all
  // elements are separated by spaces.
  for (Node current = head; current != null; current = current.next)
  {
    System.out.print(current.data + ((current.next != null) ? " " : "\n"));
  }
  // For format
  System.out.println();
 }

  public static void main(String [] args)
  {
    // Defualt constructor
    Practice8 list = new Practice8();

    //Creating a linked list Bad way but works
    list.head = new Node();
    list.head.data = 50;
    list.head.next = null;

    list.head.next = new Node();
    list.head.next.data = 25;
    list.head.next.next = null;

    list.head.next.next = new Node();
    list.head.next.next.data = 15;
    list.head.next.next.next = null;

    list.print();
  }

}
