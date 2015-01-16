package t.h;

public class Square extends Quadrangle{
	
	public Square(Point a, Point b, Point c,Point d){
		super(a,b,c,d);
	}
	
	public double computeArea()
	{
		return (a.getDistanceOfPoint(b)) * (a.getDistanceOfPoint(b));
	}
}
