package MethodOverLoadingConcept;

public class MainMethodOverLoading {

	public static void main(String[] args) {
		
	System.out.println("Main method------Array aguments");
		
		main("A");
		main(6);
		main(8,7);
		
	}
	
	public static void main(String args) {
	
		System.out.println("Main method------String argument");
	}
	public static void main(int i) {
		System.out.println("Main method------1 integer argument");
		
}
	public static void main(int j,int k) {
	
		System.out.println("Main method------2 integer arguments");
	}


	}


