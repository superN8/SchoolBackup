package hw9;
/*
 *  NOTE For this assignment (and for simplicity's sake), once the array's 
 *  [starting] capacity is set, it CANNOT be expanded upon (or shrunken).
 *
 *  For more info on how this class' methods are supposed to behave, 
 *  read the code / commentary found in the following interfaces.
 */
public class ArrayBinaryTree<T> implements TreeADT<T>, Computed_ChildLinks<T>
{
    /* --- IMPORTANT: Do NOT change either of these [2] attributes. --------- */
    private T[] data;
    
    /* --- IMPORTANT: Do NOT change either of these [2] constructors. ------- */
    public ArrayBinaryTree(T obj)
    {
        this(obj, 5);
    }
    
    /*
     *  IE. A binary tree with a [max] height of 2 needs (2^(2+1) - 1) => 7 nodes. 
     *                data[0]
     *              /         \
     *       data[1]           data[2]
     *        / \               / \
     *  data[3]  data[4]  data[5]  data[6]
     *     / \     / \      / \      / \
     *    7   8   9  10    11  12   13  14
     */
    public ArrayBinaryTree(T obj, int maxHeight)
    {
        if(maxHeight < 0)
            throw new IllegalArgumentException("Height of tree can't be negative.");
        
        int capacity = (int) Math.pow(2, maxHeight + 1) - 1;
        
        data = (T[]) new Object[capacity];
        
        data[0] = obj;
    }
    
    public T getRootElement() 
    {
        return data[0];
    }
    
    //NOTE: Assumes that 'index' is valid.
    public T getElement(int index)
    {
        return data[index];
    }

    public boolean isEmpty() 
    {
        return (data[0] == null);
    }

    public int size() 
    {
        int count = 0;
        
        for(T value: data)
        {
            if(value != null)
                count++;
        }
            
        return count;
    }

    
    /*
     *  Important: Throw an 'IllegalArgumentException' if argument is null. 
     */
    public boolean contains(T target)
    {  
    	nullCheck(target); //throws exception if target is null
    	try
    	{
    		find(target);
    	}
    	catch(RuntimeException e)
    	{
    			return false;
    	}    	
    	return true;
    }
    

    /*
     *  Important: Throw an 'IllegalArgumentException' if argument is null. Also,
     *  throw a 'RuntimeException' if argument is not found [anywhere] in the array tree.
     */
    public T find(T target)
    {	
    	nullCheck(target); //throws exception if target is null
    	boolean b = false;
    	for(T t: data)
    	{
    		b = target == t;
    		if(b)
    		{
    			break;
    		}
    	}
    	if(!b)
    	{
    		throw new RuntimeException("Target is not contained within array");
    	}
    	return target;
    }
    
    /*
     *  Important: Throw an 'IllegalArgumentException' if argument is null. 
     */
    public int indexOf(T target) 
    {
    	nullCheck(target); //throws exception if target is null
    	
    	for(int i = 0; i < data.length; i++)
    	{
    		if(target == data[i])
    		{
    			return i;
    		}
    	} 
    	
    	return -1;
    }
    
    
    /*
     *  This should work identically to how it does in 'BinaryTreeNode',
     *  only now, the argument will determine where the starting point 
     *  of the counting should be. If it were zero, then it starts at the
     *  root; if it were one, then it starts at the left child of the root
     *  (and would exclude the root parent and said root's right subtree); 
     *  if it were two, then it starts at the right child of the root, 
     *  (and would exclude the root parent and said root's left subtree), etc.
     *      - Tip: Use a [similar] recursive-based solution.
     *
     *  Important: Out-of-bound indices and null values have ZERO children.
     *      - Do not let the program crash nor return -1 for these special cases.
     *
     *  Tip: Be sure to double check the validity of your indexes before
     *       you use them as arguments for function calls / array accesses.
     */
    public int numChildren(int node) 
    {
    	int i = 0;
	    if(getLeftChild(node) != null)    		
	    {
	    	i += 1 + numChildren( getLeftIndex(node) );
	    }
	    if(getRightChild(node) != null)
	    {
	    	i += 1 + numChildren( getRightIndex(node) );
	    }
    	return i;
    }
    
    /*
     *  Important: Return -1 if 'node' is an invalid index or it's the root index.
     */
    public int getParentIndex(int node)
    {
    	int parent = (node - (2 - (node % 2))) / 2;
    	if (isValidIndex(node) && isValidIndex(parent))
    	{
    		return parent;
    	}
    	return -1;
    }
    
    /*
     *  Important: Return 'null' if computed [parent] index is invalid.
     */
    public T getParentNode(int node)
    {
    	if(isValidIndex( getParentIndex(node) ))
    	{
    		return data[ getParentIndex(node) ];
    	}
    	return null;
    }
    
    /*
     *  Important: Return 'null' if computed [parent] index is invalid.
     *             Otherwise, return the value of the [old] overwritten element.
     */
    public T setParentNode(int node, T obj)
    {
    	T old = null;
    	if(isValidIndex(getParentIndex(node)))
    	{    		
	    	old = getParentNode(node);
	    	data[getParentIndex(node)] = obj;	
    	}  	
 	  	return old;
    }
    
    /*
     *  Important: Return -1 if 'node' is an invalid index.
     */
    public int getLeftIndex(int node)
    {
    	int child = node * 2 + 1;
    	if(isValidIndex(node) && isValidIndex(child))
    	{
    		return child;
    	}
    	return -1;
    }
    
    /*
     *  Important: Return 'null' if computed [left child] index is invalid.
     */
    public T getLeftChild(int node)
    {
    	if(isValidIndex( getLeftIndex(node) ))
    	{
    		return data[ getLeftIndex(node) ];
    	}
    	return null;
    }
    
    /*
     *  Important: Return 'null' if computed [left child] index is invalid.
     *             Otherwise, return the value of the [old] overwritten element.
     */
    public T setLeftChild(int node, T obj)
    {
    	T old = null;
    	if(isValidIndex( getLeftIndex(node) ))
    	{
    		old = data[getLeftIndex(node)];
    		data[getLeftIndex(node)] = obj;
    	}
    	return old;
    }
    
    /*
     *  Important: Return -1 if 'node' is an invalid index.
     */
    public int getRightIndex(int node)
    {
    	int child = node * 2 + 2;
		if(isValidIndex(node) && isValidIndex(child))
		{
			return child;
		}
		return -1;
    }
    
    /*
     *  Important: Return 'null' if computed [right child] index is invalid.
     */
    public T getRightChild(int node) 
    {
    	if(isValidIndex( getRightIndex(node) ))
    	{
    		return data[ getRightIndex(node) ];
    	}
    	return null;
    }
    
    /* 
     * Important: Return 'null' if computed [right child] index is invalid.
     *            Otherwise, return the value of the [old] overwritten element.
     */
    public T setRightChild(int node, T obj)
    {
    	T old = null;
    	if(isValidIndex( getRightIndex(node) ))
    	{
    		old = data[ getRightIndex(node) ];
    		data[ getRightIndex(node) ] = obj;
    	}
    	return old;
    }
    
    private void nullCheck(T obj)
    {
    	if(obj == null)
    	{
    		throw new IllegalArgumentException("Target cannot be null");
    	}
    }

    private boolean isValidIndex(int index)
    { 
        return (index >= 0 && index < data.length);
    }
    
    /*  Returns a string with content of 'data' in the following format
     *  (where 'n' is equal to said array's length, minus one):
     *  "Nodes: <d[0]> <d[1]> <d[2]> ... <d[n]>"
     *  "Index:   0      1      2    ...   n   "
     */
    public String toString()
    {
        String firstRow = "Nodes: ";
        String secondRow = "Index: ";
        
        for(int index = 0; index < data.length; index++)
        {
            T value = data[index];
            
            //if(value == null)      //Note to Reader: Uncomment this bit of code  
            //	continue;			 //if you only want non-null elements to be printed.
            
            String text = "null";
            int tabLength = 2;
            
            if(value != null)
            {
                text = value.toString();
                tabLength = text.length() / 2;
            }
            
            for(int i = 0; i < tabLength; i++)
                secondRow += " ";
            
            firstRow += value + " ";
            secondRow += index + " ";
            
            if(text.length() % 2 == 0)
                tabLength--;
            
            for(int i = 0; i < tabLength; i++)
                secondRow += " ";
        }
        
        return firstRow + "\n" + secondRow;
    }
}