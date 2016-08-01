package com.training;
import java.util.*;
public class Book {
	Book(long bnum, String bname, String auth, double pric){
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
	public void setBookNumber(long bookNumber) {
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
	public int hashCode(){
		//whatever items you used for the equals property then you should use the in the hashing also
		return Objects.hash(bookNumber,bookName, author, price);
	}


}
