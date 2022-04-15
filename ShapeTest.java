package oopsDemo3;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Shape shape = new Circle(10);
      
      System.out.println("Using Interface :"+Shape.LABLE);
      
      shape.draw();
		
      System.out.println("Area of Circle is "+shape.getArea());
      
      shape =new Rectangle(10, 7);
      
      shape.draw();
      
      System.out.println("Area of Rectangle is "+shape.getArea());
	}

}
