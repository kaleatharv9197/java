package exception_handling;

public class CombinedExceptionHandlerMain {
	//command line arguments
	public static void main(String[] args) {
		try{
		int n1 = Integer.parseInt(args[0] );
			int n2 = Integer.parseInt(args[1]);	
			int result = n1/n2;
			System.out.println(result);
		}
		catch (ArrayIndexOutOfBoundsException |ArithmeticException ex) {
			if(ex instanceof ArrayIndexOutOfBoundsException)
			System.out.println("Entr atlist 2 numbr");
			else 
				System.out.println("Entr a 2nd value as non zeross");
		}
		
	}
}	



	


