import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface Show{
	public void display();
}

public class QuickStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Show obj = ()->{System.out.println("Test");};
		obj.display();
		List<String> nameList = new ArrayList<String>();
		nameList.add("Anand");
		nameList.add("Anand1");
		nameList.add("Anand2");
		nameList.add("Anand3");
		int test = 10;
		nameList.forEach(System.out::println);
		nameList.forEach((String str)->{System.out.println(str + test);//test++;//effectively final 
		});
	}

}
