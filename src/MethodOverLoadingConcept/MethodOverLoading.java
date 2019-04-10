package MethodOverLoadingConcept;

public class MethodOverLoading {

	
	public void Sum() {
		System.out.println("Sum method------0 Parameter");
	}
	
	public void Sum(String a) {
		System.out.println("Sum method------1 Parameter");
	}

	public void Sum(String a,String b) {
		System.out.println("Sum method------2 Parameters");
	}
	
	public void Sum(int x,int y,int z) {
		System.out.println("Sum method------3 Parameters");
	
	}
	
	public static void main(String [] args) {
		
		MethodOverLoading  abc = new  MethodOverLoading();
			
			abc.Sum();
			abc.Sum("Java");
			abc.Sum("Python","Peal" );
			abc.Sum(5, 10, 15);
			
		
	
	}
}
