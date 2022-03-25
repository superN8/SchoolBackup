package hw1;

import java.util.Random;

public class Deck_of_Cards 
{
	private Card[] deck;
	private int position;
	private int rI, i;
	private char suitC, rankC;
	
	public Deck_of_Cards() 
	{
		deck = new Card[52];
		this.refresh();
	}
	
	public void refresh()
	{
		for(i = 0; i < 52; i++)
		{
			
			this.dressUp(i);
			this.stackUp(i);
			deck[i]=new Card(suitC,rankC);
		}
		
		this.shuffle();
	}
	
	public void shuffle()
	{
		position = 0;
		Random rNG = new Random();
		int rndmPos = 0;
		
		for(i = 0; i < 52; i++)
		{			
			rndmPos = rNG.nextInt(52);
			this.dressUp(rndmPos);
			this.stackUp(rndmPos);
			deck[i]=new Card(suitC,rankC);	
		}
	}
	
	public void dressUp(int c)
	{
		if (c < 13)
			suitC='C';
		else if (c >= 13 && c < 26)
			suitC='D';
		else if (c >= 26 && c < 39)
			suitC='H';
		else if (c >= 39 && c < 52)
			suitC='S';
	}
	
	public void stackUp(int c)
	{
		rI = c % 13;
		if (rI == 0)
			rankC='A';
		else if (rI==1)
			rankC='1';
		else if (rI==2)
			rankC='2';
		else if (rI==3)
			rankC='3';
		else if (rI==4)
			rankC='4';
		else if (rI==5)
			rankC='5';
		else if (rI==6)
			rankC='6';
		else if (rI==7)
			rankC='7';
		else if (rI==8)
			rankC='8';
		else if (rI==9)
			rankC='9';
		else if (rI==10)
			rankC='J';
		else if (rI==11)
			rankC='Q';
		else if (rI==12)
			rankC='K';
	}
	
	public Card drawCard()
	{
		Card drawn = deck[position];
		position++;
		if (position == 52)
		{
			this.shuffle();
		}
		
		return drawn;
	}

}
