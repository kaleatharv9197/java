package java_8_Feature;

public class LambdaExpressionExample {

	public static void main(String[] args) {
		// lambda exp.(), lambda operatr ->,  lambda body {}.
		Greet gr=() -> System.out.println("WLCOME TO LAMBDA EXPRESSION");
		gr.doGreet();
		Greet gr2=() -> System.out.println("hello kass ahe CDAC");
		gr2.doGreet();
		Greet gr3=() -> {System.out.println();
		String msg =" GOOD EVNING CHALO CHAAA PIUU";
		System.out.println(msg);
		};
		gr3.doGreet();
		System.out.println("========================================");
		StringProcess upper=(String Name)-> System.out.println(Name.toUpperCase());
		StringProcess lower=(nm) -> System.out.println(nm.toLowerCase());
		lower.doProcess("jack");
		Calculator adder =(x,y) -> x+y;
		System.out.println(adder.doCalculate(5, 10));
		
		Calculator multiplier =(p,q) -> {
		int result = p * q;
		return result;
		};
		
	}

	private static Object toLowerCase() {
		// TODO Auto-generated method stub
		return null;
	}

}
interface Greet{
	void doGreet();
}
interface StringProcess{
	void doProcess( String str);
}
interface Calculator{
	int doCalculate(int a,int b);
}