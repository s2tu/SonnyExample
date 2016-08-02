package interfaces;

public interface Manager<T> {
	public void additem (T item);
	public void removeitem (T item);
	public String displayAll();
	public String displayOne(int itemID);
	
}
