package javaDemo7;

public class WorldLife {

	public static void main(String[] args) {
		

		man();
		//Creation of object of a Class
		//Syntax of object creation
		//ClasName obj = new ClassName();
		 
		WorldLife obj = new WorldLife();
		//Syntax of methodname calling
		//obj.methodname();
		obj.attitudeOfMan();
		obj.eatinfFood();
		obj.niceTree();
		
		
	}
	
	//Method has four component-public(Access modifier) void (Return Type) man(method name) {medthod body }
	public static void man() {
		System.out.println("without man world will no longer alive");
	}
	private void attitudeOfMan(){
		System.out.println("i love attituteOfMan with guts");
	}
	void eatinfFood() {
		System.out.println("atingFood life");
	}
	protected void niceTree() {
		System.out.println("its a niceTree");
	}
	
}
