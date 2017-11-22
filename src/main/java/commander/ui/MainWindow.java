package commander.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import commander.lib.SmartScroller;

public class MainWindow extends JFrame {

	private static final long serialVersionUID = 597434847352551398L;
	
	public MainWindow() {
		JComponent com;
		
		// Create base panels
		setLayout(new BorderLayout());
		
		JPanel upper = new JPanel();
		upper.setLayout(new BorderLayout());
		add(upper, BorderLayout.PAGE_START);
		JPanel lower = new JPanel();
		lower.setLayout(new BorderLayout());
		add(lower, BorderLayout.PAGE_END);
		
		// Add Map panel
		com = new JButton("Map");
		com.setPreferredSize(new Dimension(1200, 600));
		upper.add(com, BorderLayout.CENTER);
		
		// Add Control panel
		com = new JButton("Control");
		com.setPreferredSize(new Dimension(400, 600));
		upper.add(com, BorderLayout.LINE_END);
		
		// Add Status panel
		com = new JButton("Status");
		com.setPreferredSize(new Dimension(800, 300));
		lower.add(com, BorderLayout.CENTER);
		
		// Add message panel
		MessageBoard msgBoard = MessageBoard.getInstance();
		JScrollPane scrollPane = new JScrollPane(msgBoard);
		new SmartScroller(scrollPane);
		scrollPane.setPreferredSize(new Dimension(800, 300));
		lower.add(scrollPane, BorderLayout.LINE_END);
		
		// other settings
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Commander Simulator");
        setVisible(true);
	}
}
