package rest;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

public class RestClient {
	
	public static void main(String args[]){
		Client client= ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:4040/RestWebService/rest");
		String message= target.path("simple").request().get(String.class);
		System.out.println(message);
	}
}
