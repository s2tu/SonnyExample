package interfaces;

public interface  DAO <T>{
	 public int add(T item);
	 public int remove(T item);
	 public void update(T item);

}
