package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;


public class DefaultView {
	JFrame frame = new JFrame();
	public static final int rows = 4;
	public static final int columns = 4;
	JPanel keyPanel = new JPanel();
	JPanel resultPanel = new JPanel();
	JLabel resultLabel = new JLabel();
	
	public DefaultView() {
		frame.add(keyPanel);
		frame.add(BorderLayout.NORTH, resultPanel);
		resultPanel.setBackground(Color.DARK_GRAY.brighter());
		resultPanel.add(resultLabel);
		resultLabel.setFont(new Font("Monospace", Font.PLAIN, 30));
		keyPanel.setBackground(Color.DARK_GRAY.darker());
		keyPanel.setLayout(new GridLayout(rows, columns));
		frame.setSize(800, 500);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
