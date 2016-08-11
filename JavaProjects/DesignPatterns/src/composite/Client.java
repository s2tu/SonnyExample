package composite;

public class Client {
	
	public static void main(String args[]){
		Store a = new Store("A", 1);
		Store b =  new Store("B", 1);
		Store c =  new Store("C", 1);

	
		City c1 =  new City(1);
		c1.addLeaf(a);
		City c2 =  new City(1);
		c2.addLeaf(b);
		c2.addLeaf(c);
		
		
		State s =  new State(0);	
		s.addLeaf(c1);
		s.addLeaf(c2);
		
		System.out.println(s.getProfit());
	}

	
	
	

	
	
}
