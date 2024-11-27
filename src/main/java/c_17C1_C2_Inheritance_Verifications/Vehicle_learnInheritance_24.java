package c_17C1_C2_Inheritance_Verifications;

public class Vehicle_learnInheritance_24 { //Base/Super class



	public void applyHorn() {
		System.out.println(" I am from Apply Horn");
	}

	public void applyBrake() {
		System.out.println("Apply Breake");
		System.out.println("I am Basith");
	}

	public void applyMirror() {
		System.out.println("Apply Mirror");
	}


}

2. 
public class Car extends Vehicle { // this is called single level inheritance


	public void autoPilot() {

		System.out.println("Auto Pilot"); 
		System.out.println("I am Mamun");
	}


}

3.
public class BMW extends Car {

	public void gps() {

		System.out.println("GPS");
	}
	public void adasFeature() {
		System.out.println("ADAS Feature");
	}
}

4.

public class Test {

	public static void main(String[] args) {




		//create object of BMW class

		BMW obj = new BMW();

		obj.applyHorn();
		obj.applyBrake();
		obj.applyMirror();
		obj.autoPilot();
		obj.adasFeature();
		obj.gps();


	}

}
