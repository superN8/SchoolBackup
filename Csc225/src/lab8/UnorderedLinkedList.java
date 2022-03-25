package lab8;

import hw6.UnorderedListADT;

public class UnorderedLinkedList<T> extends Custom_LinkedList<T> implements UnorderedListADT<T>
{    
	public UnorderedLinkedList()    
	{        
		super();    
	}
	public void addAfter(T element, T target)
	{        
		if (isEmpty())
			throw new RuntimeException("Empty LinkedList.");
		boolean found = false;
		LinearNode<T> current = head;
		while (current != null && !found)
		{            
			if (target.equals(current.getElement()))
				found = true;
			else
				current = current.getNext();
		}
		if (!found)
			throw new RuntimeException("Element " + target + " NOT found in [Unordered] List.");
		LinearNode<T> newNode = new LinearNode<T>(element);
		newNode.setNext(current.getNext());
		current.setNext(newNode);         //IMPORTANT: The book's solution (for this method) forgets this bit of [required] code.
		if (current.equals(tail))
			tail = newNode;
		count++;
	}
	public void addToFront(T element) 
	{
		// TODO Auto-generated method stub
		
	}
	
	public void addToRear(T element) 
	{
		// TODO Auto-generated method stub
		
	}
}