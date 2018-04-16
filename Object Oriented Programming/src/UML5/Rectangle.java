package UML5;

public class Rectangle extends Shape {
	private int length;
	   private int width;
	   
	   // Constructor
	   public Rectangle(String color, int length, int width) {
	      super(color);
	      this.length = length;
	      this.width = width;
	   }
	   
	   @Override
	   public String toString() {
	      return "Rectangle[length=" + length + ",width=" + width + "," + super.toString() + "]";
	   }
	   
	   @Override
	   public double getArea() {
	      return length*width;
	   }
	

}
