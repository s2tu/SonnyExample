package com.training;
import java.util.*;
public class Book {
	//constructor can also have throws class
	Book(long bnum, String bname, String auth, double pric) throws RangeCheckException{
		if(bnum < 1000 || bnum> 10000){			
				throw new RangeCheckException(bnum);		
		}			
		bookNumber =bnum;
		bookName = bname;
		author = auth;
		price =  pric;	
	}
	private long bookNumber;
	private String bookName;
	private String author;
	private double price; 
	
	public long getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(long bookNumber){
		/* this is for declare exception 
		if(bookNumber < 1000 || bookNumber> 10000){
			throw new RangeCheckException(bookNumber);
		}*/
		
		//this is for handle exception
		if(bookNumber < 1000 || bookNumber> 10000){
			try{
				throw new RangeCheckException(bookNumber);
			}catch(RangeCheckException e){
				System.err.println(e.getMessage());
			}
		}	
		this.bookNumber = bookNumber;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public boolean equals(Object obj){
		if(this == obj){
			return true;
		}
		if (obj == null){
			return false;
		}
		if(getClass() != obj.getClass()){
			return false;
		}
		Book bk = (Book) obj;
		return bk.bookNumber == this.bookNumber && bk.bookName.equals(this.bookName) && bk.author.equals(this.author) && bk.price == this.price;
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println(this+":= Object Garbage Collected :");
	}
	@Override
	public int hashCode(){
		//whatever items you used for the equals property then you should use the in the hashing also
		return Objects.hash(bookNumber,bookName, author, price);
	}


}
