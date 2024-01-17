package javaDemo22;

public class Car {

	public static void main(String[] args) {
		
		carDriving();
		//creation of object
		// ClassName object = new ClassName();
		
		Car obj = new Car();
		
		obj.carHorn();
		obj.carMirror();
		obj.carSeat();
		
	}
      public static void carDriving() {
    	  System.out.println("I am drivring");
      }
	
	private void carHorn() {
		 System.out.println("My car horn is excellent");
		
	}
	        void carMirror() {
	        	System.out.println("My carMirror id not working");
	        }
	protected void carSeat() {
		System.out.println("carSeat should be comfortable for all");
	}        
}
