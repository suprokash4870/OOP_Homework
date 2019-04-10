package InheritanceConcept;

public class TestCar {

	public static void main(String[] args) {
		
		BMW bmw = new BMW();   	// Static Polymorphism or Compile Time Polymorphism
		
		bmw.Start();	  	 // Overridden Method (Same method name with same number of arguments are exists in both parent and child class)
		bmw.TheftSafety();
		bmw.SnowDrive();
		bmw.Stop();
		bmw.Refuel();
		
		
		System.out.println("********");

		Car car = new Car();
		
		car.Start();
		car.Stop();
		car.Refuel();
	
		System.out.println("********");	


		Car car1 = new BMW(); 	   //Dynamic Polymorphism or Run Time Polymorphism
	
		car1.Start();
		bmw.Stop();
		car1.Refuel();
		bmw.TheftSafety();
		bmw.SnowDrive();
		
	}

		
}


