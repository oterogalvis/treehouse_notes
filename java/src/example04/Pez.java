package example04;

public class Pez {
	public static void main(String[] args) {
		System.out.println("We are making a new pez dispenser.	");
		PezDispenser dispenser = new PezDispenser("Vergil");
		System.out.printf("The dispenser caracter is: %s\n", dispenser.getCaracterName());
		if (dispenser.isEmpty()) {
			System.out.println("It is currently Empty");
		}
		dispenser.load();
		System.out.println("Loading...");
		dispenser.load();
		if (!dispenser.isEmpty()) {
		System.out.println("The dispenser is not Empty");	
		}
		while (dispenser.dispense()) {
			System.out.println("Chomp!");
		}
		if (dispenser.isEmpty()) {
			System.out.println("Ate all the PEZ!");
		}
		try {
			dispenser.load(300);
		} catch (IllegalArgumentException iae){
			System.out.printf("The error is %s.\n",iae.getMessage());
		}
		while (dispenser.dispense()) {
			System.out.println("Chomp!");
		}
		
	}
}
