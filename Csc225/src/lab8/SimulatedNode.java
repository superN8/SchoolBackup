package lab8;
public class SimulatedNode<T> 
{
    protected T element;
    protected int left, right;

    //NOTE: Null children have negative indices. 
    public SimulatedNode(T obj)
    {   
        this(obj, -1, -1);   
    }
    
    public SimulatedNode(T obj, int leftSubTree, int rightSubTree) 
    {
        element = obj;
        
        if(leftSubTree < 0)
            leftSubTree = -1;
        
        if(rightSubTree < 0)
            rightSubTree = -1;
        
        left = leftSubTree;
        right = rightSubTree;
    }
    
    public T getElement() 
    { 
        return element; 
    }
    
    public void setElement(T obj) 
    { 
        element = obj; 
    }
    
    public int getLeft()
    { 
        return left; 
    }
    
    public void setLeft(int node)
    { 
        left = node; 
    }
    
    public int getRight()
    { 
        return right; 
    }
    
    public void setRight(int node) 
    { 
        right = node; 
    }
}
