package com.training.iFaces;

import java.io.Serializable;

public interface DAO<T> {
	public Object add(T object);
	public T find(Serializable key); 
}
