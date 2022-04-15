package oopsDemo3;

import java.util.Scanner;

public class Calculator implements IMath {

	Scanner kb;

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
		kb=new Scanner(System.in);
		System.out.println("Enter any two values to perform Addition");
		int a=kb.nextInt();
		int b=kb.nextInt();
		int s=a+b;
		System.out.println("Sum of "+a+" and "+b+" is "+s);
			
	}

	@Override
	public void sub() {
		
		kb=new Scanner(System.in);
		System.out.println("Enter any two values to perform Substraction");
		int a=kb.nextInt();
		int b=kb.nextInt();
		int s=a-b;
		System.out.println("Sum of "+a+" and "+b+" is "+s);
		
	}

	@Override
	public void mul() {
		
		kb=new Scanner(System.in);
		System.out.println("Enter any two values to perform Multiplication");
		int a=kb.nextInt();
		int b=kb.nextInt();
		int s=a*b;
		System.out.println("Sum of "+a+" and "+b+" is "+s);
		
		
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		kb=new Scanner(System.in);
		System.out.println("Enter any two values to perform Divison");
		int a=kb.nextInt();
		int b=kb.nextInt();
		int s=a/b;
		System.out.println("Sum of "+a+" and "+b+" is "+s);
	}
	
	public void display()
	{
	      System.out.println("My Calculator - Designed by Kiran");
	}
	
	public static void main(String[] args) {
		
		Calculator c1 =new Calculator();
		c1.display();
		c1.add();
		c1.sub();
		c1.mul();
		c1.div();
	}
}
