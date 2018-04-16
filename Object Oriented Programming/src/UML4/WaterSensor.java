package UML4;

import Composition2.Engine;

public class WaterSensor extends Sensor {
	
	public int currentLevel;
	public int desiredLevel;
	
	public boolean value;

	public WaterSensor(int currentLevel, int desiredLevel) {
		super();
		this.currentLevel = currentLevel;
		this.desiredLevel = desiredLevel;
	}
	
	public boolean check() {
		return full;
		
	}
	
	public Engine getEngine() {
		return this.getEngine();
	}
	public WaterSensor getWaterSensor() {
		return this.getWaterSensor();
	}
	public int getWashTime() {
		return this.getWashTime();
	}

}
