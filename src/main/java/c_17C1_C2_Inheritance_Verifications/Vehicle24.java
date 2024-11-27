package c_17C1_C2_Inheritance_Verifications;

public class Vehicle24 {

	public static void main(String[] args) {
	
		BMW24 obj = new BMW24();
		obj.absBrake();
		obj.applyBrake();
		obj.applyHorn();
		obj.bmwFeature();
		obj.applyMirror();
		obj.turnAC();
		obj.lockDoors();
		obj.unlockDoors();
			
		
		
	}
		
    public void applyWheel() {
    	System.out.println("I am from applywheel1");
    }
	
    public void applyHorn() {
    	System.out.println("I am from applyHorn");
    }
    public void applyBrake() {
    	System.out.println("I am from applyBrake");
    }
    public void applyMirror() {
    	System.out.println("I am from applyMirror");
    }
		
		
    public void startEngine() {
    	System.out.println("Engine started");
    }
    
    public void stopEngine() {
    	System.out.println("Engine stopped");
    }
		
    public void reFuel() {
    	System.out.println("Engine reFuel");
    }		
		
		

	}


