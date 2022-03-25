package mazeSolver;

public class Coordinate 
{
	private int x,y;
	public Coordinate()
	{
		x=0;
		y=0;
	}
	
	public Coordinate(int X, int Y)
	{
		x=X;
		y=Y;
	}
	
	public static void main(String args[])
	{
		Coordinate point = new Coordinate(0,2);
		System.out.println(point.y);
	}
}
