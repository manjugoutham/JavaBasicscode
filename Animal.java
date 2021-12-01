package bridgelabz.com;


public class Animal {
	
	//method in the superclass
	public void eat()
	{
		System.out.println("I can eat");
	}
}

//Dog inherits Animal
class Dog extends Animal
{
	//overriding the eat() method
	@Override
	public void eat()
	{
		super.eat();
		System.out.println("I eat Dog food");
	}
	
	//new method in subclass
	public void bark()
	{
		System.out.println("I can bark");
	}
}
