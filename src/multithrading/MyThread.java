package multithrading;

public class MyThread extends Thread {
	public	MyThread(String threadname) {
		super (threadname);
	}
	public void run() {
		Thread currentlyRunningThread = Thread.currentThread();
		String name =currentlyRunningThread.getName();
		System.out.println(name+"thread work..");
	}

}
