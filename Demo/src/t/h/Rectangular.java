package t.h;

public class Rectangular extends Quadrangle {

	public Rectangular(Point a, Point b, Point c,Point d){
		super(a,b,c,d);
	}
	
	public double computeArea()
	{
		return (a.getDistanceOfPoint(b)) * (a.getDistanceOfPoint(d));
	}
}
