package oopsDemo3;

public class TestStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Invoke static method before creating a obj
		
		Student.collegeChange();
		
		Student s1=new Student(10,"Sai");
		Student s2=new Student(11,"Kiran");
		Student s3 = new Student(12,"Ram");
		
		s1.display();
		s2.display();
		s3.display();
		

	}

}
