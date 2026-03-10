package Inheritance;

public class Dog extends Animal{
	
	private String breed;
	private String size;
	

	
	public Dog(String speed, int weight,String breed,String size) {
		super(speed, weight);
		this.breed=breed;
		this.size=size;
		
	}

	public static void eatFood() {
		System.out.println("Dog eats chicken");
		
	}
	
	public static void makeSound() {
		System.out.println("Dog Barks");
	}
	
	
	

}
