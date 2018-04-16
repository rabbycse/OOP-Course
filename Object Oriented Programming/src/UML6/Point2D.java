package UML6;

public class Point2D {
	private int x, y;

	   // Constructors
	   public Point2D() { 
	      this.x = 0;
	      this.y = 0;
	   }
	   public Point2D(int x, int y) {
	      this.x = x;
	      this.y = y;
	   }

	   public int getX() {
	      return this.x;
	   }
	   public void setX(int x) {
	      this.x = x;
	   }
	   public int getY() {
	      return this.y;
	   }
	   public void setY(int y) {
	      this.y = y;
	   }

	   public String toString() {
	      return "(" + this.x + "," + this.y + ")";
	   }

}
