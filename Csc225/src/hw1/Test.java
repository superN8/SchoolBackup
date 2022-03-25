package hw1;

public class Test 
{
	public static void main(String[] args)
	{
		try
		{
			Card errorCard = new Card('!', '2');
		}
		catch (IllegalArgumentException ex)
		{
			System.out.println("Test 1 Cleared!");
		}
		try
		{
			Card errorCard = new Card('C', '!');
		}
		catch (IllegalArgumentException ex)
		{
			System.out.println("Test 2 Cleared!");
		}
		System.out.println();
		//---------------------------------------------------------------------
		Deck_of_Cards X = new Deck_of_Cards();
		int drawCount = 5;
		for(int i = 0; i < drawCount; i++)
			printCard(X.drawCard());
	}
		
		public static void printCard(Card c)
		{
			String st;
			
			if(c.getRank() == '1')
				st = c.getRank() + "0 of " + c.getSuit();
			else if(c.getRank() == 'A')
				st = "Ace of " + c.getSuit();
			else if(c.getRank() == 'J')
				st = "Jack of " + c.getSuit();
			else if(c.getRank() == 'Q')
				st = "Queen of " + c.getSuit();
			else if(c.getRank() == 'K')
				st = "King of " + c.getSuit();
			else
				st = c.getRank() + " of " + c.getSuit();
		
		//NOTE: Could of had an if statement, but I've decided to
		//use a switch statement instead to "switch things up".
		switch(c.getSuit())
		{
		case 'S':
			st += "pades";
			break;
		case 'C':
			st += "lubs";
			break;
		case 'D':
			st += "iamonds";
			break;
		case 'H':   st += "earts";break;}System.out.println(st);
	}
	
}
