package bridgelabz.com;

public class VehicleMain {
	      
	    public static void main (String[] args) {
	 
	        // creating instance of the bike.
	        Bike bike = new Bike();
	        bike.changeGear(2);
	        bike.speedUp(5);
	        bike.applyBrakes(3);
	          
	        System.out.println("Bike present state :");
	        bike.printStates();
	    }
	}

