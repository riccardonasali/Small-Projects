package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.*;

import model.Model;


public class DefaultView {
	public final String [][] BUTTON_TEXTS = {
			{ "1", "2", "3", "+"},
			{ "4", "5", "6", "-"},
			{ "7", "8", "9", "*"},
			{ "0", ".", "=", "/"}
	};

	private JFrame frame = new JFrame();
	private JPanel mainPanel = new JPanel(new BorderLayout());
	private JTextField field = new JTextField(10);
	private JPanel keyPanel = new JPanel(new GridLayout(BUTTON_TEXTS.length, BUTTON_TEXTS[0].length));
	private JPanel cancelPanel = new JPanel(new GridLayout(1, 1));
	private final JButton  cancelButton = new JButton("C");
	
	private Model model;

	public DefaultView(Model model) {
		this.model = model;
		
		field.setBackground(Color.WHITE);
		field.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 24));
		field.setEditable(false);

		for (int i = 0; i < BUTTON_TEXTS.length; i++) {
			for (int j = 0; j < BUTTON_TEXTS[i].length; j++) {
				final JButton button = new JButton(BUTTON_TEXTS[i][j]);
				button.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 24));
				keyPanel.add(button);
			}
		}
		
		cancelPanel.add(cancelButton);
		cancelButton.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 24));
		

		
		mainPanel.add(field, BorderLayout.PAGE_START);
		mainPanel.add(keyPanel, BorderLayout.CENTER);
		mainPanel.add(cancelPanel, BorderLayout.PAGE_END);

		frame.add(mainPanel);
		frame.pack();
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public JFrame getFrame() {
		return frame;
	}

	public JPanel getMainPanel() {
		return mainPanel;
	}

	public JTextField getField() {
		return field;
	}

	public JPanel getKeyPanel() {
		return keyPanel;
	}

	public JPanel getCancelPanel() {
		return cancelPanel;
	}
	
	

	
}
