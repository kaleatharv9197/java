package multithrading;

public class MessageRunableMain {

	public static void main(String[] args) {
		Runnable r1 =new MessageRunable("hiii",2000);
		Runnable r2 =new MessageRunable("byyi",500);
		Thread t1 =new Thread(r1);
		Thread t2 =new Thread(r2);
		t1.start();
		t2.start();

	}

}
