package UML3;

public class Window extends Structure{
	
	private double opocity;
	private boolean isOpen;
	
	public Window(int x, int y) {
		super(x, y);
		
	}
	
	public double getOpocity() {
		return opocity;
	}
	public void setOpocity(double opocity) {
		this.opocity = opocity;
	}
	
	public void close() {
		
	}
	public void open() {
		
	}
	public boolean isOpen() {
		return isOpen;
		
	}
	@Override
	public boolean loadBearing() {
		return isOpen ;
		
	}
	

}
