package learnAbstractClass;

//its a fully abstract class , it has no abstract method
public abstract class MobileUser {

	
	void call() {//this is a no abstract method,it has implementation
	System.out.println("This is call method");	
		
	}
	
	
	abstract void sendMessage(); //this is fully a abstract method
		
}
