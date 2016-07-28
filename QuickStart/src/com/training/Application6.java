package com.training;

public class Application6 {
	
	public static void main(String[] args){
		
		Book bk;
		try {
			bk = new Book(1010,"Head", "Bob", 45000.00);
			Book bk2 = new Book(1020,"Head", "Bob1", 45000.00);
			Book bk3 = new Book(1010,"Head", "Bob", 45000.00);	
			System.out.println(bk.equals(bk3));
			System.out.println(bk.equals(bk2));
			System.out.println(bk.hashCode());
			System.out.println(bk2.hashCode());
			System.out.println(bk3.hashCode());
			System.out.println(bk.equals(null));
			Book bk4 = null;
			Book bk5 = bk;
			bk5.setAuthor("Sonny");
			System.out.println(bk.getAuthor());
			System.out.println(bk.equals(bk5));			
		} catch (RangeCheckException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		

	}

}
