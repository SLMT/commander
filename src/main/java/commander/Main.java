package commander;

import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		Random random = new Random();
		
		Soldier a = new Soldier("A");
		Soldier b = new Soldier("B");
		
		while (true) {
			a.attack(random, b);
			if (b.isDead())
				break;
			
			b.attack(random, a);
			if (a.isDead())
				break;
		}
	}
}
