package t.h;
import java.lang.Math;
public class Point {
	
	private int  x,y;
	
	public Point(int x, int y)
	{
		this.x = x; this.y = y;
	}
	
	public double getDistanceOfPoint(Point b)
	{
		return Math.sqrt((this.x - b.x)*(this.x - b.x) + (this.y - b.y)*(this.y - b.y));
	}
	
	public void toShow(Point a)
	{
		System.out.println("This is input Points:  ("+a.x+","+a.y+")");
	}

}
