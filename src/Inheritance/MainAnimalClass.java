package Inheritance;

public class MainAnimalClass {

	public static void main(String[] args) {
		
	dogDetails();
		

	}
	
	public static void  dogDetails() {
		Dog d1 = new Dog("Slow",45,"Labrador","Small");
		d1.animalFeature();
		System.out.println(d1.toString());
	}

}
