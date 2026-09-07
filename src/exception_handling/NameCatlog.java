package exception_handling;

public class NameCatlog {
	private static String[]allNames= 
			
		{"vicky","varun","kriti","deepika","ranverr"};
	
	public static int  getposition(String name)throws NameNotFoundException{
	int	position =1;
	int size = allNames.length;
	for(int index=0;index<size;index++) {
		String currentName=allNames[index];
		if (name.equals(currentName)) {
			position =index;
			break;
		}
	}
	if(position == -1) {
	NameNotFoundException nx= new NameNotFoundException(name,"unable to find name in the catlog");
	throw nx;
		
	}
	return position;
}
}
