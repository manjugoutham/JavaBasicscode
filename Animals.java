package bridgelabz.com;

public class Animals{
	   public void sound()
	   {
	      System.out.println("Animal is making a sound");   
	   }
}
class Cat extends Animals
{
    @Override
    public void sound()
    {
        System.out.println("Meow");
    }
    
}
