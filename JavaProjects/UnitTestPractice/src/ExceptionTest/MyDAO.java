package ExceptionTest;

import java.util.List;


public interface MyDAO<T> {
	public int add(T d);
	//handphone is a primary key
	public int update(long ID, String email);
	public int  delete(long ID );
	public List<T> findAll();
	public T find(long ID);

	

}
