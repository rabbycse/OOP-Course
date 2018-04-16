package Abstraction;

public class Test {
	public static void main(String[] args) {
		MobileUser r = new Rabby();
		r.sendMessage();
		r.call();
		
		MobileUser g = new Gaus();
		g.sendMessage();
	}

}
