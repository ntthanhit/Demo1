package t.h;

public class Demo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point a = new Point(0,0);
		Point b = new Point(1,0);
		Point c = new Point(1,1);
		Point d = new Point(0,1);
		
		// Show input
		a.toShow(a); 	a.toShow(b);	 a.toShow(c); 	a.toShow(d);
		
		Quadrangle q = new Rectangular(a,b,c,d);
		System.out.println("\nThis is result Perimeter of Quadrangle: "+q.computePerimeter());
		
		Quadrangle r = new Rectangular(a,b,c,d);
		System.out.println("\nThis is result Perimeter of Rectangular: "+r.computePerimeter());
		System.out.println("This is result Area of Rectangular: "+r.computeArea());
		
		Quadrangle s = new Square(a,b,c,d);
		System.out.println("\nThis is result Perimeter of Square: "+s.computePerimeter());
		System.out.println("This is result Area of Square: "+s.computeArea());
	}

}
