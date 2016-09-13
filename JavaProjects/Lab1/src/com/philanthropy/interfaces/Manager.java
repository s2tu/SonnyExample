package com.philanthropy.interfaces;

public interface Manager<T> {
	public int additem (T item);
	public int removeitem (int itemID);
	public String displayAll();
	public String displayOne(int itemID);

	
}
