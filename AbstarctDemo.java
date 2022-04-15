package oopsDemo3;

public class AbstarctDemo {
	
	public static void main(String[] args) {
		
	
	
	Trainee t1=new Marks("Kiran","AMP", 1666, 66);
	t1.show();
	double marks=t1.calculateMarks();
	System.out.println(t1 +" "+marks);
}
}
