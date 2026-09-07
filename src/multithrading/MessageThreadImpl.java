package multithrading;

public class MessageThreadImpl extends Thread {
	private Message messageObject;
	private String pattern;
	public MessageThreadImpl(Message messageObject, String pattern) {
		super();
		this.messageObject = messageObject;
		this.pattern = pattern;

	}
	public void run() {
		synchronized (messageObject) {
			
		
		
		try {
			messageObject.printMessage(pattern);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
}
