package UML4;

import java.util.Timer;


public class WashingMachine<WashOption> implements Machine{
	
	private static int option;
	//private Engine2 engine2;
	private WaterSensor waterSensor;
	private WashOption washOption;
	private Timer timer;
	private int washTime;
	private int rinseTime;
	private int spinTime;
	
	public WashingMachine( WaterSensor waterSensor, WashOption washOption,
			Timer timer, int washTime,int rinseTime, int spinTime) {
		//this.engine2 = engine2;
		this.waterSensor = waterSensor;
		this.washOption = washOption;
		this.timer = timer;
		this.washTime = washTime;
		this.rinseTime = rinseTime;
		this.spinTime = spinTime;
	}
	//public void setEngine2(Engine2 engine2) {
		//this.engine2 = engine2;
	//}
	public void setWaterSensor(WaterSensor waterSensor) {
		this.waterSensor = waterSensor;
	}
	public void setWashTime(int washTime) {
		this.washTime = washTime;
	}
	
	public static void main(String[] args) {
		
		//option = WashOption.getwashSelection();
		switch(option) {
		      case 1 :
		    	  //standardWash();
		    	  break;
		    	  
		      case 2:
		    	 // twiceRinse();
		    	  break;
		    	  
		      case 3:
		    	 // spin();
		    	  break;
		    	  
		      default:
		    	  break;
		       }
	}
	
	
	private  void spin() {
		//engine2.turnOn();
		//timer.setDuration(spinTime);
		
		//timer.start();
		//time = timer.getValue();
		//duration = timer.getDuration();
		//while(time != duration) {
			//time = timer.count();
		//}
		//engine2.turnOff();
	}
	public void turnOn() {
		
	}
	public void turnOff() {
		
	}

}
