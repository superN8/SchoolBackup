package ILOVEMAKONNEN;

public class IDontSellMollyNoMore 
{
	public static void main(String[] args) 
	{		    
		IDontSellMollyNoMore i = new IDontSellMollyNoMore();
		i.gotTheGas();
		i.gotTheCoke();
		if(time <= past)
		{
			i.sellMolly();
		}
		i.keepTheWhite();
		i.keepTheGreen();
		i.lookingForTheLean(pint);		
	}
	
	double	gas,
		    coke,
		    molly;
	static double time = 2.36,
		    	  past = time - 0.01;		    
	final static int pint = 16;
	
	public IDontSellMollyNoMore()
	{
		gas=0;
		coke=0;
		molly=0;
	}
	
	public void gotTheGas()
	{
		gas += 28;
	}
	
	public void gotTheCoke()
	{
		coke += 3.5;
	}
	
	public void sellMolly()
	{
		molly += 7;
	}
	
	public boolean keepTheWhite()
	{
		return (coke > 0);
	}
	
	public boolean keepTheGreen()
	{
		return (gas > 0);
	}
	
	public boolean lookingForTheLean(int lookingFor)
	{
		if(lookingFor != pint)
			throw new IllegalArgumentException("Not looking for a pint");
		return true;
	}	
}