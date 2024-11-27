package learnAbstactClass24;

public abstract class MobileUser {

	void call() {  //this is non abstract .it has implementation
		System.out.println("this is call method");
	}
	//after adding call method 
	abstract void sendMessage();  //this is abstract fully
	
	
}

