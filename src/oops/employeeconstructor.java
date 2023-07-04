package oops;

public class employeeconstructor {
	int empid;
	String empname;
	String designation;
	public employeeconstructor(int empid,String empname,String designation)
	{
		this.empid=empid;
		this.empname=empname;
		this.designation=designation;
		
	}
	public void display()
	{
		System.out.println("empid="+empid);
		System.out.println("empname="+empname);
		System.out.println("designation="+designation);
	}

	public static void main(String[] args) {
		employeeconstructor emp=new employeeconstructor(101,"rey","tester");
emp.display();
	}

}
