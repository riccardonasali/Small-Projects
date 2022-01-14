package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.DefaultView;

// TODO: Auto-generated Javadoc
/**
 * The Class Controller.
 */
public class Controller implements ActionListener{
	
	/** The default view. */
	private DefaultView defaultView;
	
	/**
	 * Instantiates a new controller.
	 *
	 * @param v the v
	 */
	public Controller(DefaultView v) {
		this.defaultView = v;
		defaultView.getButton().addActionListener(this);
	}
	

	/**
	 * Action performed.
	 *
	 * @param e the e
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if(inputControl(defaultView.getNumber()) == true) {
			Integer result = Integer.parseInt(defaultView.getNumber(),2);
			defaultView.getLabel().setText("The result is: " + result);
		}
		else {
			defaultView.getLabel().setText("Insert  valid number");
		}
	}
	
	/**
	 * Input control.
	 *
	 * @param string the string
	 * @return the boolean
	 */
	private Boolean inputControl(String string) {
		if(string.isBlank()) {
			return false;
		}
		
		for (char c : string.toCharArray()) {
			if(c != '1' && c != '0') {
				return false;
			}
		}
		return true;
	}

}
