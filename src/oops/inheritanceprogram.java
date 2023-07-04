package oops;
class member
{
		String name;
		int age;
		long phone;
		String address;
		int salary;
	public void printdetails()
	{
		System.out.println("name="+name);
		System.out.println("age="+age);
		System.out.println("phone="+phone);
		System.out.println("address="+address);
		System.out.println("salary="+salary);
	}
}
class employee1 extends member
{
	String specialization;
}
	class manager extends member
	{
		String department;
	}
	

public class inheritanceprogram
{

	public static void main(String[] args) 
	{
		employee1 ob=new employee1();
		ob.name="Reshma";
		ob.age=25;
		ob.phone=7598;
		ob.address="thalaserry";
		ob.salary=50000;
		System.out.println(ob.specialization="java");
		ob.printdetails();
	
		
	}
		

	}


