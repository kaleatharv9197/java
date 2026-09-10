package java_8_Feature;

public class MethodReferenceExample {

	public static void main(String[] args) {
		MyRunnable mr= new MyRunnable();
		Runnable r1 =mr::doRun;
		Runnable r2= MyRunnable::doRunAgain;
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}

}
class MyRunnable{
	void doRun() {
		System.out.println("I am runnig..........");
	}
	static void doRunAgain() {
		System.out.println("I am runnig Again ..........");
	}
}
