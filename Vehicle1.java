package bridgelabz.com;

interface Vehicle1 {
	
	void changeGear(int a);
	void speedUp(int a);
	void applyBreakes(int a);

}

class Bicycle implements Vehicle1
{
	int speed;
	int gear;
	
	@Override
	public void changeGear(int newGear)
	{
		gear = newGear;
	}
	
	@Override 
	public void speedUp(int increment)
	{
	speed = speed + increment;	
	}
	
	@Override 
	public void applyBreakes(int decrement)
	{
	speed = speed - decrement;	
	}
	
	public void Printstatus()
	{
		System.out.println(" speed: " + speed + " gear :" + gear);
	}
}


class Bike1 implements Vehicle1
{
	int speed;
	int gear;
	
	@Override
	public void changeGear(int newGear)
	{
		gear = newGear;
	}
	
	@Override 
	public void speedUp(int increment)
	{
	speed = speed + increment;	
	}
	
	@Override 
	public void applyBreakes(int decrement)
	{
	speed = speed - decrement;	
	}
	
	public void Printstatus()
	{
		System.out.println(" speed: " + speed + " gear :" + gear);
	}
}
