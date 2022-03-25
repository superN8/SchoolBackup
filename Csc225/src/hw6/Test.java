package hw6;

public class Test {

	public static void main(String[] args) 
	{
		IndexedList<String> letters = new IndexedList();
		letters.addToRear("A");
		letters.addToFront("B");
		letters.addAfter("G", "B");
		//letters.addToFront("F");
		for(int i = 0; i < letters.size(); i++)
			System.out.print(letters.get(i)+" "); 
		System.out.println();
		String value = letters.replace(1, "D");
		System.out.println("Value: " + value);
		for(int i = 0; i < letters.size(); i++)
			System.out.print(letters.get(i)+" ");
		System.out.println("\nindex: "+letters.indexOf("A"));
		
	}

}
