package javaDemo7;

public class Baba {

	public static void main(String[] args) {
		
		babaHair();
		
		Baba obj = new Baba();
		
		obj.babaDress();
		obj.babaEar();
		obj.babaNail();	
		
	}
	public static void babaHair() {
		System.out.println("babaHair is dark");
	}
	private void babaDress() {
		System.out.println("babaDress is long");
	}
	
	void babaEar() {
		System.out.println("babaEar is clear");
	}
	
	protected void babaNail() {
		System.out.println("babaNail has ten");
	}
	
	

}
