package UML3;

public abstract class Structure {
	
	public abstract boolean loadBearing();
	private Room room;
	
	public Structure(int x,int y) {
		this.room = new Room();
		room.setX(x);
		room.setY(y);
		
	}
	
	
}
