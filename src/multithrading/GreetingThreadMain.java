package multithrading;

public class GreetingThreadMain {

	public static void main(String[] args) {
		GreetingThread th = new GreetingThread();
		th.run();
	}

}
