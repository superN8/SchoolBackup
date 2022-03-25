package Jokes;

public class RobLowe
{
	public static void main(String[] args)
	{
		for(int i = 0; i < 10; i++)
		{
			System.out.println(doesRobRob()+".");
		}
	}
	
	private static boolean robRobs()
	{
		return(Math.random() < .5);
	}
	
	private static String lowe()
	{
		String robLowe="Rob";
		if(robRobs())
		{
			if(robRobs())
			{
				robLowe += "s";
			}
			else
			{
				robLowe += "bed";
			}
		}
		robLowe+=" Lowe";
		if(robRobs())
		{
			robLowe+="s";
		}
		/*String robLowe = "Rob";
		if(robRobs())
		{
			robLowe+=getTense(robLowe);
		}
		else if(robRobs())
		{
			if(robRobs())
			{
				robLowe+=" lob"+getTense(robLowe);
			}
			else
			{
				robLowe+=" row"+getTense(robLowe);
			}
		}
		robLowe+="Lowe";
		if(robRobs())
		{
			robLowe+="s";
		}		
		return robLowe;
		*/
		/*
		String robLowe="";
		if(robRobs())
		{
			if(robRobs())
			{
				if(robRobs())
				{
					robLowe+="Rob";
				}
				else
				{
					robLowe+="r";
					if(robRobs())
					{
						robLowe+="ob";
					}
					else
					{
						robLowe+="ow";
					}
				}
			}
				
		}
		else
		{
			if(robRobs())
			{
				robLowe+="lob";
			}
			else
			{
				robLowe+="Lowe";
			}
		}
		*/
		return robLowe;	
	}
	
	private static String doesRobRob()
	{
		String rob = lowe();
		if(robRobs())
		{
			rob+=" "+doesRobRob();
		}
		return rob;
	}
	/*
	private static String getTense(String robLowe)	
	{
		if(robRobs())
		{
			if(robRobs())
			{
				robLowe+="s";
			}
			else
			{
				if(robLowe.charAt(robLowe.length()-1) == 'b')
				{
					robLowe+="b";
				}
				robLowe+="ed";
			}
		}
		return robLowe+" ";
	}
	*/
}
