package Composition2;

public class Car {
	private String colors;
	private int noOfTyres;
	private Engine engine;
	
	public Car(String colors, int noOfTyres, String engineType,String engineName,String enginePower) {
		this.engine = new Engine();
		this.colors = colors;
		this.noOfTyres = noOfTyres;
		engine.setEngineName(engineName);
		engine.setEngineType(engineType);
		engine.setEnginePower(enginePower);
	}
	public String getColors() {
		return colors;
	}
	public int getNoOfTyres() {
		return noOfTyres;
	}
	public String getEngineType() {
		return engine.getEngineType();
	}
	public String getEngineName() {
		return engine.getEngineName();
	}
	public String getEnginePower() {
		return engine.getEnginePower();
	}
	
	public static void main(String[] args) {
		
		Car c = new Car("Red",4,"V8","BMW","320 BHP");
		
		System.out.println("Name:"+c.getEngineName());
		System.out.println("Type:"+c.getEngineType());
		System.out.println("Power:"+c.getEnginePower());
		System.out.println("Color:"+c.getColors());
		System.out.println("NoOfTyres:"+c.getNoOfTyres());
		
	}

}
