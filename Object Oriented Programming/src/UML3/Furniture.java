package UML3;

import java.awt.Color;

public class Furniture {
	 private Color color;
	 private Room room;
	
	public Furniture(double height,double width,Color color) {
		this.room = new Room();
		this.color = color;
		room.setHeight(height);
		room.setWidth(width);
		
	}
	
	public String getType() {
		return getType();
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public double getHeight() {
		return room.getHeight();
	}
	
	public double getWidth() {
		return room.getWidth();
	}

}
