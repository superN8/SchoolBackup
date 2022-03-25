package hw6;

public class IndexedList<T> extends Custom_ArrayList<T> implements UnorderedListADT<T>
{
	public T get(int index)
	{	
		if(index >= size() || index < 0)
			throw new IndexOutOfBoundsException("Index out of bounds");
		return list[index];
	}
	
	public T replace(int index, T elem)
	{
		if(index >= size() || index < 0)
			throw new IndexOutOfBoundsException("Index out of bounds");
		T result = list[index];
		list[index] = elem;
		return result;
	}
	
	public int indexOf(T target)
	{
		int result=-1;
		for(int i = 0; i < size(); i++) 
		{
			if (list[i] == target)
			{
				result=i;
				break;
			}
		}
		return result;
	}

	public void addToFront(T element) 
	{
		rear++;
		if(rear==list.length)
			expandCapacity();
		for(int index = rear; index > 0; index--)
		{
			list[index] = list[index-1];
		}
		list[0] = element;
	}

	public void addToRear(T element) 
	{
		if(rear==list.length)
			expandCapacity();
		list[rear] = element;
		rear++;
	}

	public void addAfter(T element, T target) 
	{
		if(size()==list.length)
			expandCapacity();
		int index = 0;
		for ( ; index < rear ; index++)
		{
			if(list[index] == target)
				break;
		}
		for(int i = rear - 1; i > index; i--)
		{
			list[i+1] = list[i];
		}
		list[index+1] = element;
		rear++;			
	}	
}
