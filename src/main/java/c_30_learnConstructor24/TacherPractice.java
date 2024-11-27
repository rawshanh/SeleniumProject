package c_30_learnConstructor24;

public class TacherPractice {
    
	String name , gender ;
	int phoneNo;
	
	TacherPractice (String n, String g, int p){
		name = n;
		gender = g;
		phoneNo = p;						
	}
	void displayInfo1() {
		System.out.println("name: "+ name);
		System.out.println("gender: "+gender );
		System.out.println("phoneNo: "+phoneNo );
	}
	
	public static void main(String[] args) {
	 
	TacherPractice teacher2 = new TacherPractice("yousuf","male",347);
	
	teacher2.displayInfo1();
	
	
	TacherPractice techer3 = new TacherPractice("atia", "female",958);
	techer3.displayInfo1();
	}


}