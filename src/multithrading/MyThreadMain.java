package multithrading;

public class MyThreadMain {

	public static void main(String[] args) {
		Thread mainThread=Thread.currentThread();
		String name = mainThread.getName();
		int priority= mainThread.getPriority();
		System.out.println(name);
		System.out.println(priority);
		
		Thread t1 = new MyThread("first");
		Thread t2 = new MyThread("sec");
		Thread t3= new MyThread("thrd");
		 t1.start();
		 t2.start();
		 t3.start();
		
		}

}
