package c_30_learnConstructor24;

public class Human24 {

	String name, gender; //Declare two variables 
	int idNo;
	
	//Type of Constructor-1)Default Constructor and 2) Parameterized Constructor
	Human24 (){ //Default Constructor
		System.out.println("No data");
	}
	
	//Parameterized Constructor and Overloading Constructor- same Constructor name but different arguments
	Human24 (String n, String g){ //2 Parameterized Constructor
		name =n;		//Assign value of variables
		gender = g;
	}
	
	Human24 (String n, String g, int i){ //3 Parameterized Constructor
		name =n;		//Assign value of variables
		gender = g;
		idNo = i;
	}
	void displayInfo () {
		System.out.println("name: "+ name);
		System.out.println("gender: "+ gender);
		System.out.println("idNo: "+ idNo);
	}	
	
	//We can create separate Test class for execution or run in the same class
	public static void main(String[] args) {
		
		Human24 human = new Human24 (); // For default Constructor
		human.displayInfo();
		
		Human24 human1 = new Human24("Mamun Chowdhury","Male");
		human1.displayInfo();
		
		Human24 human2 = new Human24("Sumaiya Chowdhury","Female",1002);
		human2.displayInfo();
			
	}
	}