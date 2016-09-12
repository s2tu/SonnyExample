package com.training.ifaces;

import java.io.Serializable;

public interface MyDao<T> {
	public Object add(T object);
	public T find(Serializable key);
	
}
