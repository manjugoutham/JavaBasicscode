package bridgelabz.com;

public class Static {
	
	static int x =5;
	static int y;
	
	static void function(int z)
	{
		System.out.println("x value = " + x);
		System.out.println("y value = " + y);
		System.out.println("z value = " + z);
	}

	static
	{
		System.out.println("Running the static initialization block.");
		y = x + 5;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		function(15);
	}

}
