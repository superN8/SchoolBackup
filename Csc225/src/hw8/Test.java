package hw8;
public class Test 
{
    /*
     *  Feel free to change the code here (within "main") to test out various things.
     *  
     *  Be sure to review (WITHOUT changing) the classes within the 'Collections' package.
     *
     *  Remember, only the code written in 'HW8_Linked_List.java' is relevant towards your grade.
     */
    public static void main(String[] args) 
    {
        Sortable_Linked_List<Integer> items = new Sortable_Linked_List();
        
        items.addToFront(6);        //{3}
        items.addToFront(8);        //{4, 3}
        items.addToRear(4);         //{4, 3, 2}
        items.addToRear(2);         //{4, 3, 2, 1}
        items.addToFront(10);        //{5, 4, 3, 2, 1}
        
        //items.removeFirst();      //{4, 3, 2, 1}
        //items.removeLast();       //{4, 3, 2}
        
        System.out.println("BEFORE sorting (" + items.size() + " nodes), ");
        System.out.println(items); 
        
        items.selectionSort();
        
        //The indices of the nodes should be the same before and after the sorting,
        //where as the elements (within the nodes) should be sorted in ascending order. 
        System.out.println("\nAFTER sorting (" + items.size() + " nodes), ");
        System.out.println(items);
    }
}