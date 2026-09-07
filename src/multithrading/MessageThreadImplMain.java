package multithrading;

public class MessageThreadImplMain {

	public static void main(String[] args) {
		Message msg = new Message(" Wlocme to Syncronization...");
		Thread t1 = new MessageThreadImpl(msg,"**********");
		Thread t2 = new MessageThreadImpl(msg,"###########");
		t1.start();
		t2.start();

	}

}
