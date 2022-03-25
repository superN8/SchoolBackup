package shapes;

public abstract class Simple_Polygon implements Polygon
{
	protected Point[] vertices;
	
	public Simple_Polygon(int s)
	{
		if (s<3)
			throw new IllegalArgumentException("Polygons must have at least 3 sides");
		vertices=new Point[s];
	}
	
	public int getNumberOfSides()
	{
		return vertices.length;
	}
	
	public boolean isEquilateral()
	{
		boolean e = true;		
		double  d = Point.distance(vertices[vertices.length - 1], vertices[0]),
			   d2 = 0;
		
		for(int i = 0; i < vertices.length - 1; i++)
		{
			d2 = Point.distance(vertices[i], vertices[i+1]);
			if (d != d2)
			{
				e = false;
				i = vertices.length;
			}
		}
		
		return e;
	}	
}
