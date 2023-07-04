package oops;
class monkey
{
	public void jump()
	{
		System.out.println("Monkey is jumping");
	}
	public void bite()
	{
		System.out.println("monkey bites reshma");
	}
	interface basicanimal
	{
		public void sleep();
		public void eat();
	}
	class human extends monkey implements basicanimal
	{
		public void speak()
		{
			System.out.println("human can speak");
		}

		@Override
		public void sleep() {
			System.out.println("human sleep");
			
		}

		@Override
		public void eat() 
		{
			System.out.println("human eat");	
		}
		
	}
}

public class interfacequestion1 {
	public static void main(String[] args) {
		human ob=new human();
		
	}
}
