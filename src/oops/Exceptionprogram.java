package oops;

public class Exceptionprogram {

	public static void main(String[] args) {
		int a=20;
		int b=0;
		try {
		int c=a/b;
		System.out.println(c);
	}
		catch(Exception e)
		{
			System.out.println("Arithmetic exception");
			System.out.println(e.getMessage());
		}
		try {
int ar[]=new int[9];
ar[0]=23;
ar[1]=15;
ar[2]=45;
System.out.println(ar[2]);
		}
	catch(Exception e)
		{
		System.out.println("arrayindexboundofexception");
		}
		System.out.println("nextline");
	}
}


