package Geometry;

public class Point {

	private int x;
	private int y;
	private boolean selected;
	
   public double distance(Point p) {
	int dx = x - p.getx();
	int dy = y - p.gety();
	return Math.sqrt(dx*dx + dy*dy);
   }
    public int getx() {
    	return x;
    }
    public int gety() {
    	return y;
    }
    public boolean isSelected() {
    	return selected;
    }
   public void setx(int x) {
	  
	   this.x = x;
	   
   }
   public void sety(int y) {
	   this.y = y;
	   
   }
   public void setselected(boolean selected) {
	   this.selected = selected;
	   
   }
}
