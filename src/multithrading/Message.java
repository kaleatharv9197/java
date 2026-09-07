package multithrading;

public class Message {
  private String content;
  
  public Message(String content ) {
	  super();
	  this.content =content;
  }
  public  void  printMessage(String Decoration) throws InterruptedException{
	  System.out.println(Decoration);
	  Thread.sleep(2000);
	  System.out.println(content);
	  Thread.sleep(2000);
	  System.out.println(Decoration);
	  Thread.sleep(2000);
	  
  }
}
