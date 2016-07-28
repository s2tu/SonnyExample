package com.training;
public class GCApplication {
	public static void main(String[] args){
		Book bk;
		try {
			bk = new Book(101, "A", "B", 20.00);
			System.out.println(bk);
			bk = null;
			System.gc();
			System.out.println("FINISHED");
			System.out.println("slksdkfjds");			
		} catch (RangeCheckException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
}
