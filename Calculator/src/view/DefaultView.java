package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class DefaultView {
	public final String [][] BUTTON_TEXTS = {
			{ "1", "2", "3", "+"},
			{ "4", "5", "6", "-"},
			{ "7", "8", "9", "*"},
			{ "0", ".", "=", "/"}
	};

	JFrame frame = new JFrame();
	JPanel mainPanel = new JPanel(new BorderLayout());
	JTextField field = new JTextField(10);
	JPanel keyPanel = new JPanel(new GridLayout(BUTTON_TEXTS.length, BUTTON_TEXTS[0].length));
	JPanel cancelPanel = new JPanel(new GridLayout(1, 1));

	public DefaultView() {
		field.setBackground(Color.WHITE);
		field.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 24));

		for (int i = 0; i < BUTTON_TEXTS.length; i++) {
			for (int j = 0; j < BUTTON_TEXTS[i].length; j++) {
				final JButton button = new JButton(BUTTON_TEXTS[i][j]);
				button.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 24));
				button.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						if(isNumeric(button.getText())) {
							field.setText(button.getText());
						}
					}
				});
				keyPanel.add(button);
			}
		}
		
		final JButton  cancelButton = new JButton("C");
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
	
	
	public static boolean isNumeric(String str) {
		  return str.matches("-?\\d+(\\.\\d+)?");
		}
	
}
