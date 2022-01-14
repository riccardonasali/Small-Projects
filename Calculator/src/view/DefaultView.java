package view;

import javax.swing.JFrame;

public class DefaultView {
	JFrame frame = new JFrame();
	
	
	public DefaultView() {
		
		frame.setSize(500, 800);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
