package oops;
class animals
{
	public void food()
	{
		System.out.println("Meat");
	}
}
	class tom extends animals
	{
		public void sleep()
		{

		System.out.println("one hour");
	}
	}
		class jerry extends animals
		{
			public void fighter()
			{
				System.out.println("jerry");
			}
		}

public class heirarchialinheritance {

	public static void main(String[] args) {
		tom ob=new tom();
		ob.sleep();
		ob.food();
		jerry ani=new jerry();
		ani.fighter();
		ani.food();
		
	
		
		


	}

}
