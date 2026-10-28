package Geometry;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Point p1 = new Point();
       
      p1.setx(50);
      p1.sety(20);
      
      Point p2 = new Point();
      
      p2.sety(30);
      p2.setx(40);
      System.out.println(p1.distance(p2));
	
	p1=p2;
	p1.setx(200);
	System.out.println(p2.getx());
	p2.sety(100);
	System.out.println(p1.gety());
	p2=p1;
	
	
	
	}

}
