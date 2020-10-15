package hello;

interface Vehicle { }

public class ParkingGarage 
{
	
	static int amount = 0;
	static int maxAmount = 20;
	
	
	static int pounds = 0;
	static int maxPounds = 25000;


	public interface Vehicle 
	{ 
		//abstract methods
		abstract String vehicleName();
		abstract int getWeightInPounds();
	}
	
	public static void Parking(Vehicle v)
	{
		
		if  ( amount <= (maxAmount-1) && pounds <= (maxPounds - v.getWeightInPounds()))
		{
			amount += 1;
			pounds += v.getWeightInPounds();
			
			int amountLeft = maxAmount - amount;
			int poundsLeft = maxPounds - pounds;

			System.out.println("The Parking Garage has Successfully parked a "+ v.vehicleName()
		                       	+". Parking Space left: "+ amountLeft
		                      	+". Parking Weight left: " + poundsLeft);
		}
		
		else
			System.out.println("The ParkingGarage is already full¡£");
	
	}
	
	
	public static class car implements Vehicle
	{
		public String vehicleName()
		{
			return "small car";
		}
		
		
		public int getWeightInPounds() 
		{
			return 1000;
		}	
		
	}
	
	public static class truck implements Vehicle
	{
		
		public String vehicleName()
		{
			return "pickup truck";
		}
		
		public int getWeightInPounds() 
		{
			return 2500;
		}
		
	}
	
	//test
	static car car1 = new car();
	static car car2 = new car();
	static car car3 = new car();
	static car car4 = new car();
	static car car5 = new car();
	static car car6 = new car();
	static truck truck1 = new truck();
	static truck truck2 = new truck();
	static truck truck3 = new truck();
	static truck truck4 = new truck();
	static truck truck5 = new truck();
	static truck truck6 = new truck();
	static truck truck7 = new truck();
	static truck truck8 = new truck();
	static truck truck9 = new truck();
	
	

	public static void main(String[] args)
	{
		//main method, test
		Parking(car1);
		Parking(car2);
		Parking(car3);
		Parking(car4);
		Parking(car5);
		Parking(car6);
		Parking(truck1);
		Parking(truck2);
		Parking(truck3);
		Parking(truck4);
		Parking(truck5);
		Parking(truck6);
		Parking(truck7);
		Parking(truck8);
		Parking(truck9);
		
	}
	
}
