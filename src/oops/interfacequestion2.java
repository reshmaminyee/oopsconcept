package oops;
interface tvremote
{
	public void access();
	public void sensor();
	
}
interface smarttvremote
{
	public void smartsensor();
}
class tv implements tvremote
{


@Override
public void access() {
System.out.println("volume");
	
}

@Override
public void sensor() {
System.out.println("Bluetooth");
	
}
}
public class interfacequestion2 {

	public static void main(String[] args) {
		tvremote ob=new tv();
		ob.access();
		ob.sensor();
	}
	}
