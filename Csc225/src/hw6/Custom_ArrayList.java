package hw6;
public abstract class Custom_ArrayList<T> implements ListADT<T>
{
	private int NOT_FOUND = -1;
	protected T[] list;
	protected int rear;
	public Custom_ArrayList()
	{
		this(100);
	}
	public Custom_ArrayList(int capacity)
	{
		rear = 0;
		list = (T[]) new Object[capacity];
	}

	public T removeFirst()
	{
		T result = first();
		rear--;
		for(int scan = 0; scan < rear; scan++)
			list[scan] = list[scan + 1];
		list[rear] = null;
		return result;
	}

	public T removeLast()
	{
		T result = last();
		rear--;
		list[rear] = null;		
		return result;
	}
	public T remove(T element)
	{        
		T result;
		int index = find(element);
		if (index == NOT_FOUND)
			throw new RuntimeException("Element " + element + " NOT found in Custom_ArrayList.");
		result = list[index];
		rear--;
		for(int scan = index; scan < rear; scan++)
			list[scan] = list[scan + 1];
		list[rear] = null;
		return result;    
	}

	public T first()
	{
		return list[0];
	}

	public T last()
	{
		return list[size()-1];
	}
	
	public boolean contains(T target)
	{        
		return (find(target) != NOT_FOUND);
	}    

	public boolean isEmpty() 
	{
		return (first() == null);
	}

	public int size()
	{
		/*
		int index = 0; 
		while(list[index] != null)
			index++;
		rear = index + 1;
		*/
		return rear;
	}
	
	private int find(T target)    
	{        
		if(!isEmpty())
		{            
			for(int index = 0; index < rear; index++)
			{                
				if(target.equals(list[index]))
					return index;            
			}
		}        
		return -1;
	}
	//NOTE: This function is NOT private so as to allow
	//subclasses to be able to increase their own lists.
	protected void expandCapacity()     
	{
		T[] newList = (T[]) new Object[list.length * 2];
		for(int i = 0; i < list.length; i++)
			newList[i] = list[i];
		list = newList;
	}
}