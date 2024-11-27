package learnAbstactClass24;

public class Test {

	public static void main(String[] args) {
		
		//we cant create object of abstract class;
		
		MobileUser mu; // refference variable superclass er 
		mu= new Karim24();
		mu.sendMessage();
		mu.call();
		
		mu= new Rahim24();
		mu.sendMessage();
		mu.call();
		
		
	}

}
