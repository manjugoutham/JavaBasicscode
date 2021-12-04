package reference;

public class Car {
	
	int speed;
	double regprice;
	String color;
	
	public Car()
	{
		super();
	}
   
	public Car(int Speed,double Regprice,String Color)
	{
		this.speed = Speed;
		this.regprice = Regprice;
		this.color = Color;
	}
	
	double getSalesPrice()
	{
		return regprice;
	}
}

	class Truck extends Car
	{
		int weight;
		
		public Truck()
		{
			super();
		}
		
		public Truck(int Speed,double Regprice,String Color,int Weight)
		{
			this.speed = Speed;
			this.regprice = Regprice;
			this.color = Color;
			this.weight= Weight;
		}
		
		double getSalesPrice()
		{
			int discount = 1;
			double salesprice = 0;
			if(weight>2000)
			{	
			salesprice = this.regprice-(discount * this.regprice/100);
			}else
			{
		    discount = 20;
			salesprice = this.regprice-(discount * this.regprice/100); 	
			}
			return salesprice;

	}
		
	}
		 
	class Ford extends Car 
		{
			private int year;
			private int manufacturerDiscount;

			public Ford (int Speed,double regularPrice,String color, int year, int
			manufacturerDiscount) {
			super (Speed,regularPrice,color);
			this.year = year;
			this.manufacturerDiscount = manufacturerDiscount;
			}

			public double getSalePrice() {
				return super.getSalesPrice() - manufacturerDiscount;
			}
		}
		
	
	class Sedan extends Car 
		 {
			 private int length;

			 public Sedan (int Speed,double regularPrice,String color, int length) {
			 super (Speed,regularPrice,color);
			 this.length = length;
			 }

			 double getSalesPrice()
				{
					int discount = 1;
					double salesprice = 0;
					if(length>20)
					{	
					 discount = 5;	
					salesprice = this.regprice-(discount * this.regprice/100);
					}else
					{
				    discount = 10;
					salesprice = this.regprice-(discount * this.regprice/100); 	
					}
					return salesprice;

			}
		 }
		 
