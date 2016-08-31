package interfaces;

public interface  DAO <T>{
	 public int add(T item);
	 public int remove(T item);
	 public int update(T item);

}
