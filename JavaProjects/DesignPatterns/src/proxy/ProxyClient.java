package proxy;

public class ProxyClient {
	//delegate task
	public static void print(NetAccess obj){
		obj.grantPermission();
	}
	public static void main(String args[]){
		NetAccess proxy = new ProxyNetAccess();
		proxy.setEmpGrade(6);
		print(proxy);
	}
}
