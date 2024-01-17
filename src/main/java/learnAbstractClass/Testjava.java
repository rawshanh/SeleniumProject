package learnAbstractClass;

public class Testjava {

	public static void main(String[] args) {
		
		MobileUser mu; // reference variable of super class
		mu = new Karim();
		mu.sendMessage();
		mu.call();
		
		
		
		mu = new Rahim();
		mu.sendMessage();
		mu.call();
		
	}

}
