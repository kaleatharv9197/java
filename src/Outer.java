
public class Outer {

	private int x =10;
	private static int y=20;
	
public void ShowMessage() {
	class Message {
		String getMessage(String name,String Message) {
			return Message +" "  + name;
			
		}
		
	}
	Message msgObj =new Message();
	String greeting = msgObj.getMessage("jack","Hello");
	 System.out.println(greeting);
		
	}
	
public static class Staticinner {
	 public void print() {
		 System.out.println("y="+y);
		 
		 
	 }
	}
	
	public class Nested {
		public void display() {
			System.out.println("x="+x);
			System.out.println("y="+y);
		}
	}



}
