package multithrading;

public class CountDownThreadMain {

	public static void main(String[] args) {
		Thread CountDown = new CountDownThread();
		System.out.println("CountDown Begins.......");
		CountDown.start();
		try {
			CountDown.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("CountDown ends..........................");

	}

}
