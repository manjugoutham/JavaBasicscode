package bridgelabz.com;

public class EncapsulationDemo {
	
	private String empname;
	private int empage;
	
	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getEmpage() {
		return empage;
	}

	public void setEmpage(int empage) {
		this.empage = empage;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulationDemo obj = new EncapsulationDemo();
		obj.setEmpname("john");
		obj.setEmpage(25);
		System.out.println("Employee Name :"+ obj.getEmpname());
		System.out.println("Employee Age :"+ obj.getEmpage());

	 
	}

}
