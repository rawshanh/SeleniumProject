package javaDemo7;

public class MyMom {

	public static void main(String[] args) {
	
		//Method has 4 part 1.public/private/default/protected (access modifier). 2. void (return type)3.methode name(main()).4 method body ({})
		
		color();
		MyMom obj = new MyMom();
		obj.hair();
		obj.love();
		obj.nail();
		
	}
	public void love() {
		System.out.println("i love my dear mom");
	}
	
	private static void color() {
		System.out.println("my mom color is white");
	}
	
	void hair() {
		System.out.println("my mom's hair is blach");
	}
	protected void nail() {
		System.out.println("i love big nail but my mom doesnt");
	}
		

}
