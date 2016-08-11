package proxy;

public class ProxyNetAccess implements NetAccess{
	private NetAccess realNetAccess;
	private int empGrade;
	@Override
	public void grantPermission() {
		RealNetAccess realNetAccess = new RealNetAccess();

		// TODO Auto-generated method stub

		if(empGrade >5){
			realNetAccess = new RealNetAccess();
			realNetAccess.grantPermission();
		}
		
	}

	@Override
	public void setEmpGrade(int empGrade) {
		// TODO Auto-generated method stub
		this.empGrade = empGrade;
		
	}
	
}
