package shapes;

public class Point 
{
	public double x, y;
	
	public Point()
	{
		x = 0;
		y = 0;
	}
	
	public Point(double w, double h)
	{
		x=w;
		y=h;
	}
	
	public static double distance(Point a, Point b)
	{
		double d=Math.sqrt
				(
					Math.pow
						( ((a.x) - (b.x)) , 2 )
					+
					Math.pow
						( ((a.y) - (b.y)) , 2 )		
				);
		return d;
	}
	
}
