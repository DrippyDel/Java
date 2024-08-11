/**
 * The class represents for the circular sorted linked list
 * @author Varik Hoang <varikmp@uw.edu>
 * @author FIRST_NAME LAST_NAME
 * @param <Type> the generic data type
 */

 // Check AbstractList.java & List.java class
public class SortedList<Type extends Comparable<? super Type>>extends AbstractList<Type>implements List<Type>
{
	/**
	 * The constructor for the circular sorted linked list.
	 */
	public SortedList()
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
			{ // Empty list case
	        newNode.next = newNode;
	        tail = newNode;
	    }
			else
			{
	        ListNode<Type> current = tail.next;
	        ListNode<Type> prev = tail;

	        do
					{
	            if (value.compareTo(current.data) <= 0)
							{
	                // Insert before current
	                newNode.next = current;
	                prev.next = newNode;
	                if (current == tail.next)
									{
	                    tail.next = newNode; // New head
	                }
	                break;
	            }
	            prev = current;
	            current = current.next;
	        }
					while (current != tail.next);

	        if (current == tail.next && value.compareTo(current.data) > 0)
					{
	            // Insert at the end
	            newNode.next = tail.next;
	            tail.next = newNode;
	            tail = newNode;
	        }
	    }
	    size++;
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

	    if (tail == null)
			{ // List is empty
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

	            // Special case: if the removed node was the current tail, update tail
	            if (tail == current)
							{
	                tail = prev;  // Update the tail to the previous node
	            }

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


	@Override
	public void set(int index, Type value)
	{
		throw new UnsupportedOperationException("The SortedList does not support set method");
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

}
