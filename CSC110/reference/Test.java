package reference;

//import java.util.Scanner;

public class Test 
{

	public static void main(String[] args) 
	{
		//int column;
		for (int row=1;row<=3;row++)
		{
			System.out.print(row+"|");
			for(int column=1;column<=3;column++)
			{
				System.out.print("\t"+column);
			}
			System.out.println();
		}
	}

}
