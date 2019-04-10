package AbstractionConcept;

public class Telecommunication3 extends Telecommunication1 implements Telecommunication2 {

		
	@Override							//Overriden from Interface class Telecommunication2
	public void Simple_Phone() {
		System.out.println("This is Simple_Phone");
		
	}

	@Override							//Overriden from Interface class Telecommunication2
	public void WirelessCommunication() {
		System.out.println("Wireless communication becomes populer now a days");
		
	}

	@Override							//Overriden from Interface class Telecommunication2
	public void Apple() {
		System.out.println("Users mostly like to use iphone");
		
	}

	@Override							//Overriden from Interface class Telecommunication2
	public void Android() {
		System.out.println("Android cell phones are populer too");
		
	}

	@Override							// Overriden from Abstract class Telecommunication1 
	public void mobile_phone() {
		System.out.println("Mobile phones have wide range of communication");
		
	}
	
	
	

}
