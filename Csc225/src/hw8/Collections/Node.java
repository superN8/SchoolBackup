
package hw8.Collections;

/* --- IMPORTANT: Do NOT change any code within this class. ----------------- */

public class Node<T>
{
    private Node<T> next;
    private Node<T> previous;
  
    private T element;
    private int index;
    
    public Node()
    {
        this(null);
    }
    
/* --- IMPORTANT: Do NOT change any code within this class. ----------------- */
    
    public Node(T elem)
    {
        next = null;
        previous = null;
        element = elem;
        index = 0;
    }
    
    public Node<T> getNext() 
    {
        return next;
    }
    
/* --- IMPORTANT: Do NOT change any code within this class. ----------------- */
    
    public Node<T> getPrevious() 
    {
        return previous;
    }
    
    public T getElement() 
    {
        return element;
    } 
    
    public int getIndex() 
    {
        return index;
    } 
    
/* --- IMPORTANT: Do NOT change any code within this class. ----------------- */
    
    public void setNext(Node<T> node) 
    {
        next = node;
        
        if(node != null)
        {
            if(previous != null)  
                index = previous.getIndex() + 1;
            
            refreshUpperIndices(node, index + 1);
        }
        else if(previous != null)
            index = previous.getIndex() + 1;
    } 
    
/* --- IMPORTANT: Do NOT change any code within this class. ----------------- */
    
    public void setPrevious(Node<T> node) 
    {
        previous = node;
        
        if(previous == null)
        {
            index = 0;
            refreshUpperIndices(next, 1);
        }
    }
    
/* --- IMPORTANT: Do NOT change any code within this class. ----------------- */
    
    public void setElement(T elem) 
    {
        element = elem;
    }
    
    //Uses recursion to change indices of all nodes from 'current' onwards.
    private void refreshUpperIndices(Node<T> current, int index)
    {
        if(current != null)
        {
            current.setIndex(index);
            refreshUpperIndices(current.getNext(), index + 1);
        }
    }
    
/* --- IMPORTANT: Do NOT change any code within this class. ----------------- */
    
    private void setIndex(int number)
    {
        index = number;
    }
}
