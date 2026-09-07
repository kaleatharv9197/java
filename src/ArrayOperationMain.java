
public class ArrayOperationMain {
	
	private static int[] getNameLengths(String[] namesCopy) {
		int size = namesCopy.length;
		int[] nameLengths =new int[size];
		int index = 0;
		for(String name : namesCopy) {
			int currentLength = name.length();
			nameLengths[index]=currentLength;
			index++;
			
		}
		return nameLengths;
	}

	public static void main(String[] args) {
		String[] names = { "Ragive","Aparna","vivek","Amruta","Dinesh","Rajkiran","Rajkamla"};
		//                    6        6        5       6         6         8         8   
		
		int[] allLength = getNameLengths(names);
		for(int len: allLength)
			System.out.println(len);
		
			

	}

}
