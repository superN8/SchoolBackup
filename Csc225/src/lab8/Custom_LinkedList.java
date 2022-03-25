package lab8;

import hw6.ListADT;

public abstract class Custom_LinkedList<T> implements ListADT<T>
{
	protected int count;
	protected LinearNode<T> head, tail;
	public Custom_LinkedList()
	{
		count = 0;
		head = null;
		tail = null;
	}
	//TODO: Implement "removeFirst" method.
	public T removeFirst()
	{
		T first = head.getElement();
		LinearNode<T> current = head.getNext();
		while(!current.getElement().equals(null))
		{
			
		}
		return first;
	}
	//Removes and returns the first element from this list.
	//TODO: Implement "removeLast" method.
	public T removeLast()
	{
		return tail.getElement();
	}
	//Removes and returns the last element from this list.
	public T remove(T element)
	{
		if (isEmpty())
			throw new RuntimeException("Empty LinkedList.");
		boolean found = false;
		LinearNode<T> previous = null;
		LinearNode<T> current = head;
		while (current != null && !found)
		{
			if (element.equals(current.getElement()))
				found = true;
			else
			{
				previous = current;
				current = current.getNext();
			}
		}
		if (!found)
			throw new RuntimeException("Element " + element + " NOT found in Custom_LinkedList.");
		if (size() == 1)
		{
			head = null;
			tail = null;
		}
		else if (current.equals(head))
			head = current.getNext();
		else if (current.equals(tail))
		{
			tail = previous;
			tail.setNext(null);
		}
		else
			previous.setNext(current.getNext());
		count--;
		return current.getElement();
	}
	public T first()
	{
		if (isEmpty())
			throw new RuntimeException("Empty LinkedList.");
		return head.getElement();
	}
	public T last() 
	{
		if (isEmpty())
			throw new RuntimeException("Empty LinkedList.");
		return tail.getElement();
	}
	//Returns true if this list contains the [specified] 'target' element, otherwise it'll return false.
	public boolean contains(T target)
	{
		if (isEmpty())
			throw new RuntimeException("Empty LinkedList.");
		LinearNode<T> current = head;
		boolean found = false;
		while(!found && !current.getElement().equals(null))
		{
			if (current.getElement().equals(target))
			{
				found = true;
			}
		}
		return found;
	}
	public boolean isEmpty()
	{
		return(head.equals(null));
	}
	//Returns true if list contains no elements, otherwise it'll return false.
	public int size()
	{
		LinearNode<T> current = head;
		int count = 0;
		while(!current.getElement().equals(null))
		{
			count++;
			current = current.getNext();
		}
		return count;
	}
	//Returns number of elements within this list.
}