package hw1;

public class Card 
{
	private char suit,
				 rank;

	public Card(char s, char r) 
	{
		boolean suited = ( s == 'C' || s == 'D' || s == 'H' || s == 'S'),
				ranked = ( r == '1' || r == '2' || r == '3' || r == '4'|| r == '5'
						|| r == '6' || r == '7' || r == '8' || r == '9'|| r == 'A'
						|| r == 'K' || r == 'Q' || r == 'J');
		if (!suited)
			throw new IllegalArgumentException("Suit must be C, D, H, or S. " + s + " is not valid");
		else
			suit = s;
		if (!ranked)
			throw new IllegalArgumentException("Rank must be a number 1-9, or an A, K, Q, or J. " + r +" is not valid");
		else
			rank = r;
	}

	public char getSuit() 
	{
		return suit;
	}

	public char getRank() 
	{
		return rank;
	}

}
