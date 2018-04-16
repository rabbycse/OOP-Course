package UML3;

import java.awt.Color;

public class Wall extends Structure{
	private  Color insideColor;
	private Color outsideColor;
	
	public Wall(int x, int y, Color insideColor, Color outsideColor) {
		super(x, y);
		this.insideColor = insideColor;
		this.outsideColor = outsideColor;
	}
	public Color getInsideColor() {
		return insideColor;
	}
	public void setInsideColor(Color insideColor) {
		this.insideColor = insideColor;
	}
	public Color getOutsideColor() {
		return outsideColor;
	}
	public void setOutsideColor(Color outsideColor) {
		this.outsideColor = outsideColor;
	}
	@Override
	public boolean loadBearing() {
		return false;
	}
	
	
		

}
