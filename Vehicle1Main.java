package bridgelabz.com;

public class Vehicle1Main {

	public static void main(String args[])
	{
		Bicycle b1 = new Bicycle();
		b1.changeGear(2);
		b1.speedUp(5);
		b1.applyBreakes(3);
	    System.out.println("Bicycle present state :");
		b1.Printstatus();
		Bike1 bike = new Bike1();
		bike.changeGear(4);
		bike.speedUp(6);
		bike.applyBreakes(3);
		System.out.println("Bike present state :");
		bike.Printstatus();
		
	}
	
}
