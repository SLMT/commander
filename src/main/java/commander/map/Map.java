package commander.map;

import commander.unit.Soldier;

public class Map {
	
	private Soldier player = new Soldier("Player", new Position(600, 300));
	private Soldier enemy = new Soldier("Enemy", new Position(400, 300));
	
	public Soldier getPlayer() {
		return player;
	}
	
	public Soldier getEnemy() {
		return enemy;
	}
}
