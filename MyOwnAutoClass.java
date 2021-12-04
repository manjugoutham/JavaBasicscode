package reference;

public class MyOwnAutoClass {
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Sedan s1= new Sedan(150, 100, "black", 25);
        Ford f1 = new Ford(120, 200, "gray", 2020, 22);
        Ford f2 = new Ford(250, 250, "blue", 2021, 30);
        Car c1 = new Car(120, 120, "red");
        System.out.println("Sedan "+s1.getSalesPrice());
        System.out.println("Ford f1 is "+f1.getSalePrice());
        System.out.println("Ford f2 is "+f2.getSalePrice());
        System.out.println("car  "+c1.getSalesPrice());

	}

}

