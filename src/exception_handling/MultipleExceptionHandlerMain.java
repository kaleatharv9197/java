package exception_handling;

public class MultipleExceptionHandlerMain {
	//command line arguments
	public static void main(String[] args) {
		try{
		int n1 = Integer.parseInt(args[0] );
			int n2 = Integer.parseInt(args[1]);	
			int result = n1/n2;
			System.out.println(result);
		}
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Entr atlist 2 numbr");
		}
		catch(ArithmeticException ex) {
			System.out.println("Entr atlist 2 numbr");
		}
	}	
	
}

	


