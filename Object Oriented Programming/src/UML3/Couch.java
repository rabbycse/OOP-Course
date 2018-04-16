package UML3;

import java.awt.Color;

public class Couch extends Furniture{
	
	private String type;
	private String material;
	
	public Couch(double height, double width, Color color) {
		super(height, width, color);
	}
	
	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getMaterial() {
		return material;
	}


	public void setMaterial(String material) {
		this.material = material;
	}


	public int numSeats() {
		return 0;
		
	}

}
