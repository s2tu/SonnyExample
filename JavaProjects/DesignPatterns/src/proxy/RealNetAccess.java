package proxy;
//real subject 
public class RealNetAccess implements NetAccess{

	private int empGrade;
	@Override
	public void grantPermission() {
		// TODO Auto-generated method stub
		System.out.println("Granted Permission");
		System.out.println("Open the Browser and start");
	}

	@Override
	public void setEmpGrade(int empGrade) {
		// TODO Auto-generated method stub
		this.empGrade = empGrade;
		
	}

}
