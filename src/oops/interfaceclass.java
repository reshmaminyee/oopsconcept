package oops;
interface calc
{
	public void add();
	public void sub();
	public void div();
}
interface calcop
{
	public void modulus();
}
class scientificcalc implements calc
{

	@Override
	public void add() {
		System.out.println("normaladd");
		
	}

	@Override
	public void sub() {
		System.out.println("normalsub");
		
	}

	@Override
	public void div() {
		System.out.println("normaldiv");
		
	}
	
}

public class interfaceclass {

	public static void main(String[] args) {
		calc ob=new scientificcalc();
		ob.add();
		ob.sub();
		ob.div();

		
		

	}

}
