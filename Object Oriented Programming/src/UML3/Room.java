package UML3;

public class Room implements Drawable{
	private int x;
	private int y;
	private double height;
	private double width;
	public Furniture Ft;
	public Structure St;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void remove() {
	}
	public void Clone() {
	}
	public void redraw() {	
	}
	public void hide() {
	}
}
