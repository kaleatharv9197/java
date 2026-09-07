package exception_handling;

public class NameNotFoundException extends Exception{
	private String invalidName;
	public NameNotFoundException(String invalidName,String errorMessage) {
		super(errorMessage);
		this.invalidName=invalidName;
		
	}
	@Override
	public String getMessage() {
		String Message=super.getMessage()+":"+invalidName;
		return Message;
	}
}
