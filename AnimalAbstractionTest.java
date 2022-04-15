package oopsDemo3;

abstract class Animal
{
	public void eat()
	{
		System.out.println("I Can Eat");
	}

   abstract void makeSound();
}

class Dog extends Animal{

	@Override
	void makeSound() {
		
		System.out.println("Bark...Bark...");
		
	}
	
}
class Cat extends Animal
{

	@Override
	void makeSound() {
		
		System.out.println("Meow...Meow....");
		
	}
	
}

public class AnimalAbstractionTest {

	public static void main(String[] args) {
	
    //Animal a = new Animal(); compiler error-Cannot create instances of Abstract class	
		
	Dog d1=new Dog();
	d1.makeSound();
	d1.eat();
	
	Cat c1=new Cat();
	c1.makeSound();
	c1.eat();
	
		

	}

}
