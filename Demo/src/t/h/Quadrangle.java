package t.h;

public abstract class Quadrangle {
	
	Point a,b,c,d;
	
	public Quadrangle (Point a, Point b, Point c, Point d)
	{
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	public double computePerimeter()
	{
		return a.getDistanceOfPoint(b) + a.getDistanceOfPoint(d) + b.getDistanceOfPoint(c) + c.getDistanceOfPoint(d);
	}
	
	public abstract double computeArea();

}
