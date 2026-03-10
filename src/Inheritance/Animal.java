	package Inheritance;
	
	public class Animal {
		
		private String speed;
		private int weight; 
		
		public Animal(String speed, int weight) {
			this.speed=speed;
			this.weight=weight;
		}
		
		public Animal() {
			
		}
		
		public static void makeSound() {
			System.out.println("Animal makes sound");
		}
		
		public void animalFeature() {
			System.out.println("this animal can run " +speed + "with weight of" +weight);
		}

		@Override
		public String toString() {
			return "Animal [speed=" + speed + ", weight=" + weight + "]";
		}
	
	}
