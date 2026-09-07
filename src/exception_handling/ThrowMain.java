package exception_handling;

public class ThrowMain {
 private static int doDivide(int x, int y) {
	 if(y==0) {
		 RuntimeException rx = new RuntimeException ("unalble to perform division");
	 }
	
	 return x/y;
	
 }
	public static void main(String[] args) {
		try {
		System.out.println(doDivide (400,80));
		System.out.println(doDivide (49,7));
		System.out.println(doDivide (70,14));
	}
		catch(RuntimeException rxRf) {
			String errorMessage = rxRf.getMessage();
			System.out.println(errorMessage);
			
		}

	}
	
}
