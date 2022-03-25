package hw8;
import hw8.Collections.Node;

/*
 *  What is class 'Node'?
 *
 *  A two-way node (with references to its own 'next' and 'previous' nodes), where
 *  each object has an auto-generated / self-updating [integer] 'index' attribute.
 *
 *  [Public] accessor and mutator methods for *all attributes, including 'element', 
 *  need to be utilized [here] properly (at appropriate times).
 *      *NOTE: Mutator function for 'index' is private. 
 */

import hw8.Collections.HW8_Linked_List;

/*
 *  What is class 'HW8_Linked_List'?
 *
 *  It's a simplified unordered list that uses two-way nodes, where
 *  each node has their own index (based on zero-based indexing applies).
 *      - Thus the first node's index is zero, the second node's index is one, etc. 
 *
 *  IMPORTANT: Do NOT override any of the methods that are inherited into 'Sortable_Linked_List'.
 *      - All methods listed in 'HW8_ListADT' have been implemented
 *        (within the 'HW8_Linked_List' class, and work as intended).
 *      
 *  TIP: Since attributes 'count', 'head', and 'tail' are all declared as private
 *  data, be sure to invoke the appropriate methods to retrieve each of said values.
 */

public class Sortable_Linked_List<T extends Comparable<T>> extends HW8_Linked_List<T>
{
    /*
     *  Notes / Tips for students:
     *      A) You'll need to utilize the "compareTo" method (on the elements, not the nodes).
     *         Remember, given "A.compareTo(B)": if A < B, it'll return a negative value.
     *                                           if A == B, it'll return zero.
     *                                           if A > B, it'll return a positive value.
     *
     *      B) Use the [provided] "swap" and "Node.setElement" methods to alter this list's content.
     *            - Remember, no index of ANY node can be modified.
     *            - Also, NONE of the 'next' and/or 'previous' references between nodes should be altered.
     *
     *      C) Since attributes 'count', 'head', and 'tail' are all marked as private,
     *         be sure to invoke the appropriate methods to retrieve each of said values.
     *
     *      D) IMPORTANT: Students are more than welcome to complete all [4] sorting algorithms, 
     *         HOWEVER, for your homework submission, you MUST delete / comment out all but two.
     *            - You can have "select & merge" or "select & quick" or 
     *                           "insert & merge" or "insert & quick".
     *            - You CANNOT have "select & insert" or "merge & quick".
     *            - Also, NONE of your sorting algorithms should print anything.
     *
     *      E) Reuse the code from the lecture's examples as the basis for this assignment.
     *            - You may discover that the link-based solutions and the array-based
     *              solutions [fundamentally] aren't all that different from each other.
     *
     *      F) Do NOT alter the headers of any of the functions (seen below).
     *            - You also shouldn't modify any of the existing code 
     *              that's found within the provided functions' bodies.
     */
    
    private void swap(Node<T> one, Node<T> two)
    {
        T temp = one.getElement();
        one.setElement(two.getElement());
        two.setElement(temp); 
    }
    
//------------------------------------------------------------------------------

    //TODO: Implement either: selection sort or insertion sort.
    
    public void selectionSort()
    {
    	Sortable_Linked_List<T> tempL1 = this;
    	Sortable_Linked_List<T> tempL2 = tempL1;
    	T tempT1=tempL1.getHeadNode().getElement();
	    T tempT2=tempL1.getHeadNode().getElement();
    	Node<T> tempN = new Node(tempT1);
    	/*
    	while(!isEmpty())
    	{
    		tempL1.addToFront(removeFirst());
    	}
    	swap(tempN, tempL1.getTailNode());
    	tempT1 = tempN.getElement();
    	*/
        //Insert your code here
    	while(!tempL1.isEmpty())
    	{
	    	if(tempT1.compareTo(tempL1.removeFirst()) <= 0)
	    	{
	    		tempN = new Node(tempT1);
	    		addToFront(tempT1);
	    	}
	    	else
	    	{
	    		
	    	}
    	}
    }
    
//------------------------------------------------------------------------------  
    
    public void insertionSort()
    {
        //Insert your code here
    }
    
//------------------------------------------------------------------------------   
    
    //TODO: Implement either: merge sort or quick sort.
    
    public void mergeSort()
    {
        mergeSort(0, size() - 1); 
    }
    
    private void mergeSort(int min, int max)
    {
        if(min < max) 
        {
            int midpoint = (min + max) / 2; 
            
            mergeSort(min, midpoint);
            mergeSort(midpoint + 1, max); 
            
            merge(min, midpoint, max);
        }
    }
    
    private void merge(int first, int mid, int last)
    {
        //Insert your code here
    }
    
//------------------------------------------------------------------------------
    
    public void quickSort()
    {
        quickSort(0, size() - 1);
    }
    
    private void quickSort(int min, int max)
    {
        if(min < max)
        {
            int partitionIndex = partition(min, max);
            
            quickSort(min, partitionIndex - 1);
            quickSort(partitionIndex + 1, max);
        }
    }
    
    private int partition(int min, int max) 
    {
        //Insert your code here
        return -1;
    }
}