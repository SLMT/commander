package commander;

import java.util.Random;

public class Soldier {
	
	private static final int INITIAL_HP = 100;
	private static final int POWER = 10;
	
	private String name;
	private int hp;
	private boolean isDead;
	
	public Soldier(String name) {
		this.name = name;
		this.hp = INITIAL_HP;
		this.isDead = false;
	}
	
	public void attack(Random random, Soldier target) {
		MessageBoard.info(String.format("Soldier %s attacks soldier %s", name, target.name));
		
		// Generate the damage
		int damage = random.nextInt(POWER);

        // Attack
        target.takeDamage(damage);
	}
	
	public void takeDamage(int damage) {
		if (hp <= damage) {
			hp = 0;
			isDead = true;
			MessageBoard.info(String.format("Soldier %s got %d damage and dead.", name, damage));
		} else {
			hp -= damage;
			MessageBoard.info(String.format("Soldier %s got %d damage and has %d HP now.",
					name, damage, hp));
		}
	}
	
	public boolean isDead() {
		return isDead;
	}
}
