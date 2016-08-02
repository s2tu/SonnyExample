package domains;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Utilities {

	public  void serializing(Object obj){
		//implementing autoclosable
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File("serializedobj.txt")))){
			out.writeObject(obj);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	public  Invoice deserializing(){
		//implementing autoclosable
		try(ObjectInputStream out = new ObjectInputStream(new FileInputStream(new File("serializedobj.txt")))){
			Invoice returnedInvoice =(Invoice)out.readObject();
			return returnedInvoice;
		}catch(Exception e){
			System.out.println(e.getMessage());
			return null;
		}
	}	
}
