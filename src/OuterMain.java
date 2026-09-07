
public class OuterMain {

	public static void main(String[] args) {
		Outer.Staticinner staticInnerRef =new Outer.Staticinner();
		staticInnerRef.print();
		 System.out.println("======================");
		 Outer OuterRef=new Outer();
		 Outer.Nested nestedRef = OuterRef.new Nested();
		 nestedRef.display();
		 System.out.println("======================");
		 OuterRef.ShowMessage();
		 System.out.println("======================");
		 
		 CurencyConverter forex=null ;
		 
		 System.out.println(forex.doConvert(10000));
		 
		 System.out.println("======================");
		 forex=new RupeeToPoundConverter();
		 System.out.println(forex.doConvert(1000000));
		 System.out.println("======================");
		 
		 forex = new CurencyConverter() {
			 @Override
			 public float doConvert(float amountInKwacha) {
				 return amountInKwacha;
			 }
	};
	
	 System.out.println("amountInKwacha" +forex.doConvert(10000));
	 System.out.println("======================");
	 forex = new CurencyConverter() {
		 @Override
		 public float doConvert(float amountInYen) {
			 return amountInYen;
		 }
};

 System.out.println("amountInYen" +forex.doConvert(500000));
 System.out.println("======================");
 }
}


	


