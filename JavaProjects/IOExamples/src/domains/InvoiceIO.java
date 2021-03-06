package domains;
import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class InvoiceIO {
	public boolean writeDetails(Collection<Invoice> invList){
		boolean result = false;
		
		try{
			PrintWriter out = new PrintWriter(new FileWriter("readthisfile.txt"));
			for(Invoice i: invList){
				out.println(i.toString());
			}
			out.close();
			return true;
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		return result;
	}
	public Collection<Invoice> readDetails(){
		Collection<Invoice> details = null;
		List invoicesData = new ArrayList<Invoice>();
		try {
			FileReader fr = new FileReader("readthisfile.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			try{
				while((line=br.readLine()) != null){
					String output = line;
					String invoiceData[] = output.split(":");
					Invoice newinvoice = new Invoice(Integer.parseInt(invoiceData[0]), invoiceData[1], Double.parseDouble(invoiceData[2]));
					invoicesData.add(newinvoice);
				}
				br.close();
				details = invoicesData;
				return invoicesData;
			}catch(IOException e){
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return details;
		
	}
}
