package ThreadSafe;

public class RequestHandlerClient {
	public static void main(String args[]){
	//	RequestHandler test1 = RequestHandler.getInstance();
	//	RequestHandler test2 = RequestHandler.getInstance();
	//	System.out.println(test1.hashCode() + "\tHASHCODE");
	//	System.out.println(test2.hashCode() + "\tHASHCODE");
			
	//	System.out.println(test1.equals(test2));
		Runnable runable = new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				RequestHandler handler = RequestHandler.getInstance();
				System.out.println(Thread.currentThread().getName() +"\t" + handler.hashCode() + "\tTHREAD_HASHCODE");
			}
			
		};
		
		Thread th1 = new Thread(runable, "a");
		Thread th2 = new Thread(runable, "b");
		Thread th3 = new Thread(runable, "c");
		
		th1.start();
		th2.start();
		th3.start();
	}
}
