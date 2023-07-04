package oops;

public class employee {
	int empid;
	String empname;
	String designation;
	public void display()
	{
		System.out.println("empid="+empid);
		System.out.println("empname="+empname);
		System.out.println("designation="+designation);
	}

	public static void main(String[] args) {
	employee emp1=new employee();
	emp1.empid=101;
	emp1.empname="Resh";
	emp1.designation="Tester";
	emp1.display();
		

	}

}
