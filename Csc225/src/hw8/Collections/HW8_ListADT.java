
package hw8.Collections;

/* --- IMPORTANT: Do NOT change any code within this interface. ------------- */

public interface HW8_ListADT<T>
{
    //Inserts said 'element' to the front of this list.
    public void addToFront(T element);
    
    //Inserts said 'element' to the end of this list.
    public void addToRear(T element);
    
    //Removes and returns the front element from this list.
    public T removeFirst();

    //Removes and returns the rear element from this list.
    public T removeLast();

    //Returns true if list contains no elements, otherwise it'll return false. 
    public boolean isEmpty(); 

    //Returns number of elements within this list. 
    public int size(); 
    
    //Accessor function for the front-most node within the list.
    public Node<T> getHeadNode();
    
    //Accessor function for the rear-end node within the list.
    public Node<T> getTailNode();
}

/* --- IMPORTANT: Do NOT change any code within this interface. ------------- */