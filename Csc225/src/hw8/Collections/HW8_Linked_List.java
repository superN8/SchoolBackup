
package hw8.Collections;

/* --- IMPORTANT: Do NOT change any code within this class. ----------------- */

public class HW8_Linked_List<T> implements HW8_ListADT<T>
{
    private int count;
    private Node<T> head, tail; 

    public HW8_Linked_List()
    {
        count = 0;
        head = null;
        tail = null;
    }
    
/* --- IMPORTANT: Do NOT change any code within this class. ----------------- */
    
    public void addToFront(T element)
    {
        Node<T> newNode = new Node<T>(element);
      
        if (isEmpty())
            tail = newNode;
        else 
        {
            newNode.setNext(head);
            head.setPrevious(newNode);
        }
        
        head = newNode;
      
        count++;
    }
    
/* --- IMPORTANT: Do NOT change any code within this class. ----------------- */
    
    public void addToRear(T element)
    {
        Node<T> newNode = new Node<T>(element);
		
        if (isEmpty())
            head = newNode;
        else 
        {
            tail.setNext(newNode);
            newNode.setPrevious(tail);
        }
        
        tail = newNode;
				
        count++;
    }
    
/* --- IMPORTANT: Do NOT change any code within this class. ----------------- */
    
    public T removeFirst()
    {
        if (isEmpty())
            throw new RuntimeException("Empty LinkedList.");
      
        Node<T> result = head; 
        head = head.getNext();
        
        if (head == null)
            tail = null;
        else
            head.setPrevious(null);
        
        count--;
      
        return result.getElement();
    }
    
/* --- IMPORTANT: Do NOT change any code within this class. ----------------- */
    
    public T removeLast()
    {
        if (isEmpty())
            throw new RuntimeException("Empty LinkedList.");
      
        Node<T> result = tail; 
        tail = tail.getPrevious();
        
        if (tail == null)
            head = null;
        else
            tail.setNext(null);
        
        count--;
      
        return result.getElement();
    }
    
/* --- IMPORTANT: Do NOT change any code within this class. ----------------- */
    
    public boolean isEmpty()
    {
        return (count == 0);
    }

    public int size()
    {
        return count;
    }
    
    public Node<T> getHeadNode()
    {
        return head;
    }
    
    public Node<T> getTailNode()
    {
        return tail;
    }
    
/* --- IMPORTANT: Do NOT change any code within this class. ----------------- */ 
    
    //NOTE: The alignment / spacing of the values works best with single digit numbers.
    public String toString()
    {
        if(head == null)
            return "Empty";
        
        Node<T> current = head;
        String firstRow = "Elements: {";
        String secondRow = " Indices:  ";

        while(current != null)
        {
            firstRow += current.getElement();
            if(current.getNext() != null)
                firstRow += ", ";
            
            secondRow += current.getIndex() + "  ";
            current = current.getNext();
        }

        return firstRow + "}\n" + secondRow;
    }
}

/* --- IMPORTANT: Do NOT change any code within this class. ----------------- */