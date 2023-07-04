package oops;

public class polymorphism {

	public static void main(String[] args) {
		polymorphism ob=new polymorphism();
		ob.add(20, 30);
		ob.add(40, 10.25);
		ob.add(30.15,15);
		ob.add(20, 30, 40);
	}
//by changing no.of arguments or parameters
	public void add(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	public void add(int a,int b,int c)
	{
		int sum=a+b+c;
		System.out.println(sum);
	}
	//by changing the data type of arguments
	public void add(int a,double b)
	{
		double sum=a+b;
		System.out.println(sum);
	}
	//by changing the order of the parameter
	public void add(double a,int b)
	{
		double sum=a+b;
		System.out.println(sum);
	}
}
