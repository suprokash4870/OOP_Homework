package AbstractionConcept;

public class TestTelecommunication {

	public static void main(String[] args) {
	
		Telecommunication3 tele3 = new Telecommunication3();
		
		
			tele3.mobile_phone();    // From Abstract class Telecommunication1
			tele3.T_mobile();	     //  From Abstract class Telecommunication1
			tele3.Verizon();	     //  From Abstract class Telecommunication1
			tele3.Boost_Mobile();    //  From Abstract class Telecommunication1
			
			
			tele3.Apple();		     // From Interface class Telecommunication2
			tele3.Android();	     // From Interface class Telecommunication2
			tele3.Simple_Phone();    // From Interface class Telecommunication2
			tele3.WirelessCommunication();    // From Interface class Telecommunication2
	}

}
