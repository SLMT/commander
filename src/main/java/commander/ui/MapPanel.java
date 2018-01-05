package commander.ui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import commander.map.Map;
import commander.map.Position;

public class MapPanel extends JPanel {
	
	private static final long serialVersionUID = -2017355995986571769L;
	
	private static final Color PLAYER_COLOR = new Color(39, 174, 96);
	private static final Color ENEMY_COLOR = new Color(192, 57, 43);
	
	private Map map;
	
	MapPanel(Map map) {
		this.map = map;
	}
	
	@Override
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		g.setColor(PLAYER_COLOR);
		Position pos = map.getPlayer().getPos();
		g.fillOval(pos.getX(), pos.getY(), 20, 20);
		
		g.setColor(ENEMY_COLOR);
		pos = map.getEnemy().getPos();
		g.fillOval(pos.getX(), pos.getY(), 20, 20);
	}
}
