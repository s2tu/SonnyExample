package com.training.iFaces;

import java.io.Serializable;
import java.util.List;

public interface DAO<T> {
	public Object add(T object);
	public T find(Serializable key); 
	public List<T> getAll();
}
