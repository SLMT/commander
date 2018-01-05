package commander;

import commander.map.Map;
import commander.ui.MainWindow;

public class Main {
	
	private static final Map map = new Map();

	private static void createAndShowGUI() {
		new MainWindow(map);
	}

	public static void main(String[] args) {
		// Schedule a job for the event-dispatching thread
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
		
		// Start simulation
//		Random random = new Random();
//
//		Soldier a = new Soldier("A");
//		Soldier b = new Soldier("B");
//
//		while (true) {
//
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			
//			a.attack(random, b);
//			if (b.isDead())
//				break;
//
//			b.attack(random, a);
//			if (a.isDead())
//				break;
//		}
	}
}
