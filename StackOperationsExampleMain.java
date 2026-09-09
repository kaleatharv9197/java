package collection_framework;

import java.util.Stack;

public class StackOperationsExampleMain {

	public static void main(String[] args) {
		Stack stItems=new Stack();
		stItems.push("pen");
		stItems.push("pencil");
		stItems.push("eresor");
		stItems.push("ruler");
		stItems.push("draftre");
		
		for(Object Obj :stItems) {
			System.out.println(Obj);
			}
		
			System.out.println("Current size"+stItems.size());
			System.out.println("==-=-=-=-=-=-==-=-==-==-=-=-==-=-=-");
			Object poppedObject =stItems.pop();
			System.out.println("poppedObject:-"+poppedObject);
			System.out.println("Current size"+stItems.size());
			System.out.println("==-=-=-=-=-=-==-=-==-==-=-=-==-=-=-");
			Object peekObject =stItems.peek();
			System.out.println("peekObject:-"+peekObject);
			System.out.println("Current size"+stItems.size());
			
	}
	
}
