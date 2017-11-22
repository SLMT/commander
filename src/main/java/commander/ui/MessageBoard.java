package commander.ui;

import javax.swing.JTextArea;

public class MessageBoard extends JTextArea {
	
	private static final long serialVersionUID = 2167260442795979266L;
	
	private static final MessageBoard instance = new MessageBoard();
	
	public static MessageBoard getInstance() {
		return instance;
	}

	public static void info(String message) {
		instance.append("[INFO] " + message + "\n");
	}
	
	public static void comm(String caller, String message) {
		instance.append("[COMM] " + caller + ": " + message + "\n");
	}
	
	private MessageBoard() {
		
	}
}
