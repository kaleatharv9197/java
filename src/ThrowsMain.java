
public class ThrowsMain {
private static void doTest() throws Exception{
	
}
private static void performTest() throws Exception{
	 doTest();
}
private static void callperformTest()  throws Exception{
	performTest();
}

 private static void callDoTest() {
	try 
	{
		doTest();
	}
	catch(Exception ex) {
		System.out.println(ex);
	}
}
 private static void invokedoTest() throws Exception{
	 doTest();
 }
	
	public static void main(String[] args) {
		callDoTest();
		try 
		{	
		invokedoTest();
		}
		catch(Exception ex) {
			System.out.println(ex);
			}
		

	}

}
