package controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Model;
import view.DefaultView;

public class Controller {
	
	private Model model;
	private DefaultView defaultView;
	
	public Controller(Model model, DefaultView defaultView) {
		this.model = model;
		this.defaultView = defaultView;
	}
	
	class operatorListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
		
	}
	
	public static boolean isNumeric(String str) {
		  return str.matches("-?\\d+(\\.\\d+)?");
		}
}
