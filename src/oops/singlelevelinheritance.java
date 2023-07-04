package oops;
class parent
{
	public void add()
	{
		System.out.print("am_");
	}
}
	class child extends parent
	{
		public void sub()
	{
			System.out.println("resh");
			
	}
	}
public class singlelevelinheritance 
{
	public static void main(String[] args) {
		child ins=new child();
		ins.add();
		ins.sub();
	}
}
