package shapes;

public class Triangle extends Simple_Polygon 
{
	public Triangle(Point a, Point b, Point c)
	{
		super(3);
		vertices[0]=a;
		vertices[1]=b;
		vertices[2]=c;
	}

	public double getPerimeter() 
	{
		return Point.distance(vertices[0], vertices[1])
			 + Point.distance(vertices[1], vertices[2])
			 + Point.distance(vertices[2], vertices[0]);
	}

	public double getArea() 
	{		
		return Math.abs(
			   ((vertices[0].x * (vertices[1].y - vertices[2].y))
			   +(vertices[1].x * (vertices[2].y - vertices[0].y))
			   +(vertices[2].x * (vertices[0].y - vertices[1].y)))
			   / 2);
	}
}
