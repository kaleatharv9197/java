package multithrading;

public class MessageThread extends Thread  {
	// print the message 10 time with gap btwn.
	private String message ;
	private int timeGap;
	public MessageThread(String message, int timeGap) {
		super();
		this.message = message;
		this.timeGap = timeGap;
	}
	public void run() {
		for(int a=1;a<=10;a++) {
			System.out.println(message+":"+a);
			try {
				Thread.sleep(timeGap);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	

}
