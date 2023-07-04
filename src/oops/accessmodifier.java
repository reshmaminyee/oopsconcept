package oops;
class P
{
	private int v=4;
	String name;
}

public class accessmodifier {
	private int a=10;
	protected int sal=10000;
	
	public static void main(String[] args) {
		accessmodifier ob=new accessmodifier();
		System.out.println(ob.a);
	    System.out.println(ob.sal);
P ob1=new P();
ob1.name="abc";
	}

}
