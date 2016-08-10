package ThreadSafe;

public class RequestHandler {
	private volatile static RequestHandler handler;
	
	private RequestHandler(){
		
	}
	
	public void sayBye(){
		System.out.println("Bye");
	}
	
	public static RequestHandler getInstance(){
		System.out.println(Thread.currentThread().getName() + " Checking");
		if(handler == null){
			synchronized(RequestHandler.class){
				if(handler == null){
					System.out.println(Thread.currentThread().getName() + " Object Created");
					handler = new RequestHandler();
				}
			}
		}
		return handler;
	}
	
}
