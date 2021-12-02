package bridgelabz.com;

interface InterfaceFields {

	public static int num=10;
	public void display();
}

class Fields implements InterfaceFields
{
	public static int num=100;
	public void display()
	{
		System.out.println("this is the Display method");
	}
	
	public void show()
	{
		System.out.println("this is the Show method");
	}
}	

//class Main {
//	
//	public static void main(String args[])
//	{
//		Fields obj = new Fields();
//		System.out.println("Value of num of the interface \"+InterfaceField.num");
//		System.out.println("Value of num of the class \"+obj.num");
//		
//	}
//}