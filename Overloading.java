package bridgelabz.com;

public class Overloading {

	void demo(int a)
	{
	System.out.println("a:"+a);
	}
	
	void demo(int a,int b)
	{
	System.out.println("a and b: " + a + "," + b);
	}
	
	double demo(double a)
	{
		System.out.println("a:"+a);
		return a*a;
	}

    public static void main (String args [])
    {
    	Overloading Obj = new Overloading();
        double result;
        Obj .demo(20);
        Obj .demo(20, 30);
        result = Obj .demo(5.5);
        System.out.println("Output : " + result);
    }
}