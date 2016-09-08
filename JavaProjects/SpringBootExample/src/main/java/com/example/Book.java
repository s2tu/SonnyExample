package com.example;

import org.springframework.stereotype.Component;

@Component
public class Book {
	private long bookNumber;
	private String bookName;
	public Book(){
		super();
	}
	/**
	 * @return the bookNumber
	 */
	public long getBookNumber() {
		return bookNumber;
	}
	/**
	 * @param bookNumber the bookNumber to set
	 */
	public void setBookNumber(long bookNumber) {
		this.bookNumber = bookNumber;
	}
	/**
	 * @return the bookName
	 */
	public String getBookName() {
		return bookName;
	}
	/**
	 * @param bookName the bookName to set
	 */
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	/**
	 * @param bookNumber
	 * @param bookName
	 */
	public Book(long bookNumber, String bookName) {
		super();
		this.bookNumber = bookNumber;
		this.bookName = bookName;
	}

	
}
