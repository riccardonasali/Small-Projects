package view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.*;

/**
 * The Class DefaultView.
 */
public class DefaultView {
	
	/** The frame. */
	private JFrame frame = new JFrame("Bin2Dec");
	
	/** The north panel. */
	private JPanel northPanel = new JPanel();
	
	/** The center panel. */
	private JPanel centerPanel = new JPanel();
	
	/** The south panel. */
	private JPanel southPanel = new JPanel();
	
	/** The label. */
	private JLabel label = new JLabel("Insert a binary numbe to convert");
	
	/** The text field. */
	private JTextField textField = new JTextField("", 8);
	
	/** The button. */
	private JButton button = new JButton("Convert");
	
	/** The result label. */
	private JLabel resultLabel = new JLabel();
	
	/**
	 * Instantiates a new default view.
	 */
	public DefaultView() {
		frame.add(BorderLayout.NORTH, northPanel);
		northPanel.add(label);
		northPanel.add(textField);
		textField.setBackground(Color.DARK_GRAY.brighter());
		frame.add(BorderLayout.CENTER, centerPanel);
		centerPanel.add(resultLabel);
		frame.add(BorderLayout.SOUTH, southPanel);
		southPanel.add(button);
		
		northPanel.setBackground(Color.DARK_GRAY.darker());
		label.setForeground(Color.WHITE);
		textField.setForeground(Color.WHITE);
		centerPanel.setBackground(Color.DARK_GRAY.darker());
		resultLabel.setForeground(Color.WHITE);
		southPanel.setBackground(Color.DARK_GRAY.darker());

		frame.setSize(500, 125);
		frame.getRootPane().setDefaultButton(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	/**
	 * Gets the button.
	 *
	 * @return the button
	 */
	public JButton getButton() {
		return button;
	}
	
	/**
	 * Gets the number.
	 *
	 * @return the number
	 */
	public String getNumber() {
		return textField.getText();
	}
	
	/**
	 * Gets the label.
	 *
	 * @return the label
	 */
	public JLabel getLabel() {
		return resultLabel;
	}
	
}
