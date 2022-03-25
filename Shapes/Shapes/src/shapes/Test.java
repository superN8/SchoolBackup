package shapes;
//Here's some simple test code to help verify that your classes / math all work out as expected.
//Keep in mind that the actual test code (used for grading) will be much more thorough than this.
public class Test 
{
    public static void main(String args[]) 
    {
        //*** Test 1 - Distance between [2] points. ****************************
        Point a = new Point(0, 0);
        Point b = new Point(3, 4); 
        
        double expectedResult = 5.0;
        double d = Point.distance(a, b);
        
        System.out.println("D = " + d + " | ER = " + expectedResult);
        System.out.println("Same distances? - " + (expectedResult == d));
        
        //*** Tests 2 & 3 - Perimeter & Area of a Triangle. ******************** 
        Point t1 = new Point(0, 1);
        Point t2 = new Point(1, 0);
        Point t3 = new Point(-1, 1);
        
        Polygon p1 = new Triangle(t1, t2, t3);
        
        System.out.println(" Tri: Per. = " + p1.getPerimeter());    //Should be ~4.65
        System.out.println(" Tri: Area = " + p1.getArea());         //Should be 0.5
        
        //*** Tests 4 & 5 - Perimeter & Area of a Quadrilateral. ***************
        
        //Note: If you change any of the following "Q points", make sure that 
        //they're still organized in a clockwise manner. (q1 -> q2, q2 -> q3, etc.)
        
        Point q1 = new Point(0, 0);
        Point q2 = new Point(3, 0);
        Point q3 = new Point(3, 3);
        Point q4 = new Point(0, 3);
        
        Polygon p2 = new Quadrilateral(q1, q2, q3, q4);
        
        System.out.println("Quad: Per. = " + p2.getPerimeter());    //Should be 12
        System.out.println("Quad: Area = " + p2.getArea());         //Should be 9
        System.out.println("equal = " + p1.isEquilateral());
    }
}
