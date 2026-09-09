package collection_framework;

import java.util.LinkedList;

public class LinkedListExampleMain {

	public static void main(String[] args) {
		LinkedList appliances =new LinkedList();
		appliances.add("fan");
		appliances.add("mixer");
		appliances.add("tublight");
		appliances.add("wasghing machine ");
		appliances.addFirst("microwave");
		 for(Object Obj:appliances)
			 System.out.println(Obj); 
		 System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		 appliances.removeFirst();
		 appliances.removeLast();
		 for(Object Obj:appliances)
			 System.out.println(Obj); 
		 System.out.println("First Element:-"+appliances.getFirst());
		 System.out.println("Last Element:-"+appliances.getLast());
		 
		 
	}

}
