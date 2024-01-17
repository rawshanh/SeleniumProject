package javaDemo9;

public class MobilePhone1 {

	public static void main(String[] args) {
	
		ringing();		
		
		MobilePhone1 obj = new MobilePhone1();
		obj.vibrating();
		obj.button();
		obj.color();
		}
        public static void ringing() {
		
        System.out.println("my cell phone is ringing");
          }
        private void vibrating() {
        System.out.println("i try to avoid vibration mode on my phone");	
        }
        void color() {
        
        System.out.println("Jet black is my fav color");
        }
        
        protected void button() {
        System.out.println("My phone button became to soft");
 
        }
}
