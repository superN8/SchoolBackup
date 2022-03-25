package lab8;

public class LinkedQueue<T> implements QueueADT<T>
{    
	private int count;
	private LinearNode<T> head;
	private LinearNode<T> tail;
	public LinkedQueue()
	{        
		count = 0;
		head = null;
		tail = null;
	}
	public void enqueue(T element)
	{
		LinearNode<T> node = new LinearNode(element);
		if(isEmpty())
			head = node;
		else
			tail.setNext(node);
		tail = node;
		count++;
	}
	public T dequeue()
	{
		if(isEmpty())
			throw new RuntimeException("Empty stack.");
		T result = head.getElement();
		head = head.getNext();
		count--;
		if(isEmpty())
			tail = null;
		return result;
	}
	//lecture 8
	//TODO: Implement "first" method.
	//Returns (without removing) the element at the front of this queue.
	public T first()
	{	
		return head.getElement();
	}
	//TODO: Implement "isEmpty" method.
	//Returns true if queue contains no elements, otherwise it'll return false.
	public boolean isEmpty()
	{
		return false;
	}
	//TODO: Implement "size" method.
	//Returns number of elements within this queue.
	public int size()
	{
		return 0;
	}
	
}
