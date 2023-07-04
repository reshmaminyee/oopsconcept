package oops;
class employee100
{
	private String name;
	private int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}

public class encapsulation {

	public static void main(String[] args) {
		employee100 ob=new employee100();
		ob.setName("Reshma");
		System.out.println(ob.getName());
		ob.setSalary(10000);
		System.out.println(ob.getSalary());
		

	}

}
