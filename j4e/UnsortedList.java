/**
 * The class represents for the circular unsorted linked list
 * @param <Type> the generic data type
 */

 // Check AbstractList.java & List.java class
public class UnsortedList<Type> extends AbstractList<Type> implements List<Type> {
    /**
     * The constructor for the circular unsorted linked list.
     */
    public UnsortedList()
    {
        super();
        tail = null;
        size = 0;
    }

    @Override
    public boolean contains(Type value)
    {
        return getIndex(value) >= 0;
    }

    @Override
    public void insert(Type value)
    {
        if (value == null)
        {
            throw new NullPointerException("Error NULL Pointer");
        }

        ListNode<Type> newNode = new ListNode<>(value);

        if (tail == null)
        { // The list is empty
            newNode.next = newNode;
            tail = newNode;
        }
        else
        { // The list is not empty
            newNode.next = tail.next; // New node points to the head
            tail.next = newNode; // The current tail points to the new node
            tail = newNode; // Update the tail to be the new node
        }

        size++;
    }

    public void display() {
        if (tail == null) {
            System.out.println("[]");
            return;
        }

        StringBuilder builder = new StringBuilder();
        builder.append("[");

        ListNode<Type> current = tail.next; // Start from the head
        while (current != tail) {
            builder.append(current.data).append(", ");
            current = current.next;
        }
        builder.append(tail.data); // Append the last element

        builder.append("]");
        System.out.println(builder.toString());
    }

    @Override
    public void clear()
    {
        tail = null;
        size = 0;
    }

    @Override
    public Type remove(Type value)
    {
        if (value == null)
        {
            throw new NullPointerException("Error NULL Pointer");
        }

        if (tail == null) { // List is empty
            return null;
        }

        ListNode<Type> current = tail.next;
        ListNode<Type> prev = tail;
        do
        {
            if (current.data.equals(value))
            {
                if (current == tail.next && current == tail)
                { // Single element list
                    tail = null;
                }
                else
                {
                    if (current == tail.next)
                    { // Removing head
                        tail.next = current.next;
                    }
                    else if (current == tail)
                    { // Removing tail
                        prev.next = tail.next;
                        tail = prev;
                    }
                    else
                    { // Removing from middle
                        prev.next = current.next;
                    }
                }
                size--;
                return current.data;
            }
            prev = current;
            current = current.next;
        }
        while (current != tail.next);

        return null; // Element not found
    }

    @Override
    public Type removeAtIndex(int index)
    {
        if (index < 0 || index >= size)
        {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        ListNode<Type> current = tail.next;
        ListNode<Type> prev = tail;
        for (int i = 0; i < index; i++)
        {
            prev = current;
            current = current.next;
        }

        if (current == tail.next && current == tail)
        { // Single element list
            tail = null;
        }
        else
        {
            if (current == tail.next)
            { // Removing head
                tail.next = current.next;
            }
            else if (current == tail)
            { // Removing tail
                prev.next = tail.next;
                tail = prev;
            }
            else
            { // Removing from middle
                prev.next = current.next;
            }
        }
        size--;
        return current.data;
    }

		public void set(int index, Type value)
		{
        if (index < 0 || index >= size)
				{
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        if (value == null)
				{
            throw new NullPointerException("Error NULL Pointer");
        }

        ListNode<Type> newNode = new ListNode<>(value);

        if (index == 0)
				{
            // Replacing the first node (head)
            newNode.next = tail.next.next;
            tail.next = newNode;
            if (size == 1)
						{
                tail = newNode;
            }
        }
				else
				{
            ListNode<Type> current = tail.next;
            for (int i = 0; i < index - 1; i++)
						{
                current = current.next;
            }
            newNode.next = current.next.next;
            current.next = newNode;
            if (index == size - 1)
						{
                // If we're replacing the last node, update the tail
                tail = newNode;
            }
        }
    }

    @Override
    public Type get(int index)
    {
        if (index < 0 || index >= size)
        {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        ListNode<Type> current = tail.next; // Start from the head
        for (int i = 0; i < index; i++)
        {
            current = current.next;
        }
        return current.data;
    }

    public static void main(String[] args) {
        UnsortedList<Integer> list = new UnsortedList<>();

        // Test insert
        list.insert(1);
        list.insert(2);
        list.insert(3);
        System.out.print("Test insert, Output: [1,2,3]. After insertion: ");
        list.display(); // Output: [1, 2, 3]

        // Test get
        System.out.println("Test Get, Output: 2. Element at index 1: " + list.get(1)); // Output: 2

        // Test set
        list.set(1, 5);
        System.out.print("Test Set, Output: [1, 5, 3]. After setting index 1 to 5: ");
        list.display(); // Output: [1, 5, 3]

        // Test contains
        System.out.println("Test Contains, Contains 3: " + list.contains(3)); // Output: true
        System.out.println("Contains 4: " + list.contains(4)); // Output: false

        // Test remove
        list.remove((Integer) 5);
        System.out.print("Test Remove, Output: [1, 3]. After removing 5: ");
        list.display(); // Output: [1, 3]

        // Test removeAtIndex
        list.removeAtIndex(0);
        System.out.print("After removing element at index 0: ");
        list.display(); // Output: [3]

        // Test clear
        list.clear();
        System.out.print("After clearing the list: ");
        list.display(); // Output: []
    }
}
