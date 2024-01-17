package javaDemo7;

public class FlowerName {

	public static void main(String[] args) {
	
		leaf();
					
		FlowerName obj = new FlowerName();
		obj.flower();
		obj.smell();
		
		
	}
	public static void leaf(){
		System.out.println("leaf needed for beautiness");
		
	}
	
	private void flower (){
		
		System.out.println("flower given by my dear hubby");
		
	}
	void smell() {
		System.out.println("i smell of leafs ");
	}		

}
