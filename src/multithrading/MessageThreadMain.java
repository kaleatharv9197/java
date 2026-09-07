package multithrading;

public class MessageThreadMain {

	public static void main(String[] args) {
		Thread t1=new MessageThread("Hello",2000);
		Thread t2=new MessageThread("Welcome",500);
		t1.start();
		t2.start();
	}

}
