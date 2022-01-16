package view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.*;


public class DefaultView {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	
	public DefaultView() {
		
		frame.add(panel);
		panel.add(label);
		panel.setBackground(Color.DARK_GRAY.darker());
		
		frame.setSize(800, 600);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
