package lab8;
public class SimulatedArrayBinaryTree_Template<T> implements TreeADT<T>
{
    protected SimulatedNode<T> tree[];
    protected int count;
    
    //For simplicity's sake, we won't deal with empty trees
    //and it won't be possible to remove nodes / elements.
    public SimulatedArrayBinaryTree_Template(T element)
    {
        this(10, element);
    }
    
    public SimulatedArrayBinaryTree_Template(int capacity, T element)
    {
        tree = new SimulatedNode[capacity];
        tree[0] = new SimulatedNode(element);
        
        count = 1;
    }
    
    private void expandCapacity()
    {
        SimulatedNode<T> newTree[] = new SimulatedNode[tree.length * 2];
        
        for(int i = 0; i < tree.length; i++)
            newTree[i] = tree[i];
        
        tree = newTree;
    }
    
    public T getRootElement() 
    {
        if(isEmpty())
            throw new RuntimeException("Empty tree.");
        
        return tree[0].getElement();
    }

    public boolean isEmpty() 
    {
        return (count == 0);
    }

    public int size() 
    {
        return count;
    }

    public boolean contains(T target) 
    {
        for(int i = 0; i < count; i++)
        {
            if(tree[i].getElement().equals(target))
                return true;
        }
        
        return false;
    }

    public T find(T target) 
    {
        for(int i = 0; i < count; i++)
        {
            T current = tree[i].getElement();
            
            if(current.equals(target))
                return current;
        }
        
        throw new RuntimeException("Element " + target + " in NOT in Simulated_BinaryArrayTree.");
    }
    
    /*
     *  Set the given element as the [new] left child of the
     *  node located at 'index'. Be sure to do the following:
     *      1). Throw an exception if the node at 'index' is null.
     *              - You can assume that 'index' is within the array's bounds.
     *      2). Expand the array's capacity (when appropriate to do so).
     *      3). Check whether or not the node (at 'index') already has
     *          a [left] child or not, if so set said child as the left 
     *          child of our new node.
     *      4). Place the new node at the "end" of our array (right
     *          after the previous node / element that was inserted).
     *              - Remember, attribute 'count' signifies the "end".
     *              - Also, don't forget to increment 'count' afterwards.
     *  
     *  TIP: Don't forget that the left & right children, of each
     *  [simulated] node, are denoted with integers (NOT as nodes).
     */
    public void addToLeft(int index, T element)
    {
        //TODO
    }
    
    /*
     *  Set the given element as the [new] right child of the
     *  node located at 'index'. Be sure to do the following:
     *      1). Throw an exception if the node at 'index' is null.
     *              - You can assume that 'index' is within the array's bounds.
     *      2). Expand the array's capacity (when appropriate to do so).
     *      3). Check whether or not the node (at 'index') already has a
     *          [right] child or not, if so set said child as the right 
     *          child of our new node.
     *      4). Place the new node at the "end" of our array (right
     *          after the previous node / element that was inserted).
     *              - Remember, attribute 'count' signifies the "end".
     *              - Also, don't forget to increment 'count' afterwards.
     *
     *  TIP: Don't forget that the left & right children, of each
     *  [simulated] node, are denoted with integers (NOT as nodes).
     */
    public void addToRight(int index, T element)
    {
        //TODO
    }
    
    public void printTree_LevelOrder()
    {
        if(isEmpty())
        {
            System.out.println("Empty");
            return;
        }
            
        LinkedQueue<Integer> nodes = new LinkedQueue();
        
        nodes.enqueue(0);

        UnorderedLinkedList<T> results = new UnorderedLinkedList();

        while(!nodes.isEmpty()) 
        {
            Integer item = nodes.dequeue();
            
            if(item != -1)
            {
                results.addToRear(tree[item].getElement());
                nodes.enqueue(tree[item].getLeft());
                nodes.enqueue(tree[item].getRight());
            }
            else
                results.addToRear(null);
        } 
        
        while(!results.isEmpty())
            System.out.println(results.removeFirst());
        
        System.out.println();
    }
}