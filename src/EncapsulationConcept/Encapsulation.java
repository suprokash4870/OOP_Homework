package EncapsulationConcept;



public class Encapsulation {
	
	private String name;
	private int age;
	private int ssn;

	public static void main(String[] args) {
		
		Encapsulation enc =	new Encapsulation();
		
		enc.setName("Suprokash Sanyal");
		enc.setAge(36);
		enc.setSsn(123456);
		
		System.out.println("name is: "+enc.getName());
		System.out.println("age is: "+enc.getAge());
		System.out.println("ssn is: "+enc.getSsn());
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	
	
	
	
}
