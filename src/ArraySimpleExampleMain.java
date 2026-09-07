
public class ArraySimpleExampleMain {

	public static void main(String[] args) {
		int[] numbers=new int [5];
		numbers[0]=36;
		numbers[1]=42;
		numbers[2]=78;
		numbers[3]=2;
		numbers[4]=15;
		
		
		int arraySize = numbers.length;
		for(int index=0;index<arraySize;index++) {
			int number =numbers[index];
			System.out.println(number);
			
		}
		System.out.println("==========");
		for (int val: numbers) {
			System.out.println(val);
			}
		
		

	}

}
