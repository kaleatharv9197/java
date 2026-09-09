package collection_framework;

import java.util.Vector;

public class VectorExampleMain {

	public static void main(String[] args) {
		Vector myVector=new Vector();
		int size=myVector.size();
		System.out.println("size"+size);
		int capacity =myVector.capacity();
		System.out.println("capacity"+capacity);
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		for(int count=1;count<10;count++)
			myVector.add(count);
		System.out.println("size:-"+myVector.size());
		System.out.println("capacity:-"+myVector.capacity());
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			myVector.add(11);
		System.out.println("size:-"+myVector.size());
		System.out.println("capacity:-"+myVector.capacity());
		
		
	}

}
