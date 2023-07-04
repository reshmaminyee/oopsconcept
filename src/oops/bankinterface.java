package oops;

import java.util.Scanner;

interface bank
{
	public void accountdetails();
	public void balance();
	public void deposit();
	public void withdraw();
}
class Sbi implements bank
{
	static String bankname="SBI";
	int balance=65121;
	int deposit=75422;
	String name="Reshma";
	int accountno;
	Scanner sc=new Scanner(System.in);
	@Override
	public void accountdetails() {
		System.out.println("enter your account number");
		accountno=sc.nextInt();
		System.out.println("your bank="+bankname+"your name="+name+"your account no="+accountno);
	}
	@Override
	public void balance() {
System.out.println(balance);		
	}
	@Override
	public void deposit() {
System.out.println("enter your deposit amount");	
int deposit=sc.nextInt();
balance=balance+deposit;
System.out.println("deposit amount="+deposit+"finalbalance="+balance);
	}
	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		
	}
	
}
