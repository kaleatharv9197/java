package multithrading;

public class MessageRunable implements Runnable {
	private String message ;
	private int timeGap;
	@Override
	public void run() {
		
			for(int a=1;a<=10;a++) {
				System.out.println(message+":"+a);
				try {
					Thread.sleep(timeGap);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();}
			}
}
	public MessageRunable(String message, int timeGap) {
		super();
		this.message = message;
		this.timeGap = timeGap;
	}
}
