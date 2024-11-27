package c_30_learnConstructor24;

public class Teacher24 {

	String name, gender;
	int phoneNo;
	
	Teacher24 (String n, String g, int p){ //Parameterized constructor
		name =n;
		gender = g;
		phoneNo = p;
	}
	void displayInfo () {
		System.out.println("name: "+ name);
		System.out.println("gender: "+ gender);
		System.out.println("phoneNo: "+ phoneNo);
	}	

	public static void main(String[] args) {

	//@Test
	//public void test() {
		Teacher24 teacher = new Teacher24("Mamun Chowdhury","Male",682208424);
		teacher.displayInfo();
		
		Teacher24 teacher1 = new Teacher24("Sumaiya Chowdhury","Female",682208423);
		teacher1.displayInfo();
	}

}