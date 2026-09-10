package java_8_Feature;

public class IntrfaceEnhancementExample {

	public static void main(String[] args) {
		printable.info();
		printable pr = new printableImpl() ;
			pr.print();
			
	}

}	



interface printable{
	void print();
	default void setUp() {
		System.out.println("setting of the printer , paper etc...");
	}
	static void info() {
		System.out.println("This finctionaly is use to perform printing");
}
}
class printableImpl implements printable{
	@Override
	public void print() {
		setUp();
		System.out.println("printing the document");
	}}
