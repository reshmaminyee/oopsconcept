package oops;
class parenting
{
	public void phone()
	{
		System.out.println("samsung");
	}
	public void job()
	{
		System.out.println("system engineer");
	}
}
class children extends parenting
{

	@Override
	public void phone()
	{
		System.out.println("iphone");
		super.phone();
	}

	@Override
	public void job() 
	{
		System.out.println("android developer");
		super.job();
	}
}
public class methodoverriding {

	public static void main(String[] args) {
		children ob=new children();
		ob.phone();
		ob.job();
	}

}
