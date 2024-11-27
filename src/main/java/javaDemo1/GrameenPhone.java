package javaDemo1;

public class GrameenPhone {

	public static void main(String[] args) {
		
		//ringTone();
		call();
		
		//ChromeDriver obj = new ChromeDriver();
		// Syntax ClassName obj = new ClassName();
		
		GrameenPhone obj = new GrameenPhone();	
		  obj.ringTone();
		  //obj.phoneButton();
		  obj.messages();
		  obj.phoneButton();

	}
	
     public  void ringTone() {
    	System.out.println("ringTone is mendatory for everyone");
    	
    }
    private static void call() {
	  System.out.println("i have a call to pickup");
    	
  }
    void phoneButton() {
    System.out.println("my phoneButton is black");
    	
    }
    
    protected void messages() {
    
    	System.out.println("i have to message ekram bhai");
    }
    
}
