package shapes;

public class Quadrilateral extends Simple_Polygon
{

	public Quadrilateral(Point a, Point b, Point c, Point d) 
	{
		super(4);
		vertices[0]=a;
		vertices[1]=b;
		vertices[2]=c;
		vertices[3]=d;
	}

	public double getPerimeter() 
	{		
		return Point.distance(vertices[0], vertices[1])
			 + Point.distance(vertices[1], vertices[2])
			 + Point.distance(vertices[2], vertices[3])
			 + Point.distance(vertices[3], vertices[0]);
	}

	public double getArea() 
	{
		Polygon t1 = new Triangle(vertices[1], vertices[0], vertices[3]),
				t2 = new Triangle(vertices[1], vertices[2], vertices[3]);		
		return t1.getArea() + t2.getArea();
	}
	
}
