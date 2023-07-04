package oops;
class college
{
	public void Students()
	{
		System.out.println("departments");
	}

}
class professors extends college
{
	public void uniforms()
	{
		System.out.println("pink colour");
	}
}
class principal extends professors
{
	public void lecture()
	{
		System.out.println("assemble");
	}
}

public class multilevelinheritance {

	public static void main(String[] args) {
		principal ob=new principal();
		ob.Students();
		ob.uniforms();
		ob.lecture();
				

	}

}
