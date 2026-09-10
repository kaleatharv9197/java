package java_8_Feature;

public class SwitchCaseExample {

	public static void main(String[] args) {
	 int rating = 3;
	 switch(rating) {
	 case 1-> System.out.println("poor");
	 case 2-> System.out.println("good");
	 case 3-> System.out.println("exicllancet");
	 default-> System.out.println("invalid");

	 }
	 System.out.println("==========================");
	 char status ='o';
	 String accountstatus = switch(status) {
	 case'o' -> "OPENED";
	 case'A' -> "ACTIVE";
	 case'I' -> "INACTIVE";
	 case'C' -> "CLOSED";
	 default -> "INVALID";
	 };
	System.out.println(accountstatus); 
	 
	}

}
