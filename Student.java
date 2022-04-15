package oopsDemo3;

public class Student {

	private int rollNo;
	private String name;
	private static String college="PCET";
	

	public Student(int rollNo, String name) { //Generate using Constructors
		
		this.rollNo = rollNo;
		this.name = name;
	}


static void collegeChange()
{
    college="BVC";
}



void display()
{
    System.out.println(rollNo+" "+name+" "+college);
}
}