package oops;
abstract class car
{
	abstract public void carengine();
	public void averagespeed()
	{
		System.out.println("average speed");
	}
}
class kia extends car
{

	@Override
	public void carengine() {
		System.out.println("kia engine");	
	}
}
class bmw extends car
{

	@Override
	public void carengine() {
		System.out.println("bmw engine");
		
	}
	
}
public class abstractclass {

	public static void main(String[] args) {
		kia ob=new kia();
		ob.averagespeed();
		ob.carengine();
		bmw ob1=new bmw();
		ob1.averagespeed();
		ob1.carengine();
		

	}

}
