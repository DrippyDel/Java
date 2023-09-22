public class Node
{
  // Each node holds a single character
  char data;

  // Reference to next string's first node.
  Node next;

  // Reference to node with the next character in this string.
  Node down;

  Node(char data)
  {
    this.data = data;
  }
}
