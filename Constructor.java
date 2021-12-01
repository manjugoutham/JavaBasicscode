package bridgelabz.com;

public class Constructor {

	int id;
	String name;
	
	Constructor(int i,String n)
	{
		this.id=i;
		this.name=n;
	}
	
	void Display() 
	{
		System.out.println("Details id and name : "+id+ " "+name );
	}
	
	public static void main(String args[])
	{
		Constructor con = new Constructor(10,"Kadhar");
		Constructor con1 = new Constructor(20,"Arjun");
		con.Display();
		con1.Display();
	}
	
}
