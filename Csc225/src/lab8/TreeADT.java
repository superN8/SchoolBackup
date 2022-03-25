package lab8;

public interface TreeADT<T>
{
	public T getRootElement();    //Returns true if this tree has no elements, otherwise it'll return false.
	public boolean isEmpty();    //Returns value indicating the [current] number of elements within this tree.
	public int size();    //Returns true if the tree contains an element that matches
						  //the specified 'target', otherwise it'll return false.
	public boolean contains(T target);    //Returns a reference to the specified 'target' element if it is     
										  //found within this tree, otherwise it'll throw an exception.
	public T find(T target);
}