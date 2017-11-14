package commander;

public class MessageBoard {
	
	public static void info(String message) {
		System.out.println("[INFO] " + message);
	}
	
	public static void comm(String caller, String message) {
		System.out.println("[COMM] " + caller + ": " + message);
	}
}
